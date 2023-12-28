package net.leah.piratedive.item.custom;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class StormHeartItem extends AxeItem { //registering item as an axe
    public StormHeartItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) { //importing axe class things(I think(I don't know the correct terminology))
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) { //exactly the same as before, just add in your cooldown again
        if((world.getOtherEntities(user, Box.of(user.getPos(),10,10,10))) != null && !(world.getOtherEntities(user,Box.of(user.getPos(),10,10,10))).isEmpty()) { //check if any entites are nearby excluding player

            user.getItemCooldownManager().set(this, 500);


            LivingEntity target = world.getClosestEntity(LivingEntity.class, TargetPredicate.DEFAULT,user,user.getX(),user.getY(),user.getZ(), Box.of(user.getPos(),10,10,10)); //find entity closest to player
            LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, world);//make lightning entity
            lightning.setPos(target.getX(),target.getY(),target.getZ());//set position of lightning strike
            world.spawnEntity(lightning);//spawn in lightning

        }

        return super.use(world, user, hand);
    }
}
