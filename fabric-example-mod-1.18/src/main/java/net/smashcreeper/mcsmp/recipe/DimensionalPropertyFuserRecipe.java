package net.smashcreeper.mcsmp.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.loader.impl.util.log.Log;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.smashcreeper.mcsmp.ModInit;

public class DimensionalPropertyFuserRecipe implements Recipe<SimpleInventory>{

    private final Identifier id;
    private final ItemStack output;
    private final DefaultedList<Ingredient> recipeItems;
    private final int cost;

    public DimensionalPropertyFuserRecipe(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems, int cost) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
        this.cost = cost;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient()) { return false; }

        if(recipeItems.get(0).test(inventory.getStack(1))){
            return true;//recipeItems.get(0).test(inventory.getStack(2));
        }
        return false;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory) {
        // TODO Auto-generated method stub
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public ItemStack getOutput() {
        // TODO Auto-generated method stub
        return output.copy();
    }

    @Override
    public Identifier getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        // TODO Auto-generated method stub
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        // TODO Auto-generated method stub
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<DimensionalPropertyFuserRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "dimensional_property_fuser";
    }

    public static class Serializer implements RecipeSerializer<DimensionalPropertyFuserRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "dimensional_property_fuser";
        // this is the name given in the json file

        @Override
        public DimensionalPropertyFuserRecipe read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            int costnum = JsonHelper.getInt(json, "cost");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new DimensionalPropertyFuserRecipe(id, output, inputs, costnum);
        }

        @Override
        public DimensionalPropertyFuserRecipe read(Identifier id, PacketByteBuf buf) {
            int costnum = buf.readInt();
            ModInit.LOGGER.info(Integer.toString(costnum));
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new DimensionalPropertyFuserRecipe(id, output, inputs, costnum);
        }

        @Override
        public void write(PacketByteBuf buf, DimensionalPropertyFuserRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput());
        }
    }
    
}
