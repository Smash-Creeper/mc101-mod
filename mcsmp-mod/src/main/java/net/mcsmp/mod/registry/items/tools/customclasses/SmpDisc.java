package net.mcsmp.mod.registry.items.tools.customclasses;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class SmpDisc extends MusicDiscItem {
    public SmpDisc(int comparatorOutput, SoundEvent sound, Settings settings){
        super(comparatorOutput, sound, settings);
    }
}
