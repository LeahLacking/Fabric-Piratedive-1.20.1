package net.leah.piratedive.item.client;

import net.leah.piratedive.item.custom.PirateArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PirateHatArmorRenderer extends GeoArmorRenderer<PirateArmorItem> {
    public PirateHatArmorRenderer() {
        super(new PirateHatArmorModel());
    }
}
