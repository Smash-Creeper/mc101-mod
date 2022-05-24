package net.smashcreeper.mcsmp.items;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class ModMusicDisc extends MusicDiscItem {
    protected ModMusicDisc(int comparatorOutput, SoundEvent sound, Item.Settings settings) {
        super(comparatorOutput,sound,settings);
    }
}
