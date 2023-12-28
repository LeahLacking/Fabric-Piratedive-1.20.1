package net.leah.piratedive.item.client;

import net.leah.piratedive.PirateDive;
import net.leah.piratedive.item.custom.PirateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class PirateHatArmorModel extends GeoModel<PirateArmorItem> {
    @Override
    public Identifier getModelResource(PirateArmorItem animatable) {
        return new Identifier(PirateDive.MOD_ID, "geo/pirate_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(PirateArmorItem animatable) {
        return new Identifier(PirateDive.MOD_ID, "textures/armor/pirate_hat.png");
    }

    @Override
    public Identifier getAnimationResource(PirateArmorItem animatable) {
        return new Identifier(PirateDive.MOD_ID, "animations/pirate_hat.animation.json");
    }
}
