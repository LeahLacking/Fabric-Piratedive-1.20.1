package net.leah.piratedive.sound;

import net.leah.piratedive.PirateDive;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {


    public static final SoundEvent MOTHERFUCKING_CLOCK = registerSoundEvent("motherfucking_clock");
    public static final SoundEvent WELLERMAN = registerSoundEvent("wellerman");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(PirateDive.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        PirateDive.LOGGER.info("Registering Sounds for " + PirateDive.MOD_ID);
    }
}
