package net.the2019.industrialrevolution.item.custom;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SalmonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.the2019.industrialrevolution.item.ModItems;

import java.util.Random;

public class KnifeItem extends Item {
    public KnifeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(!user.getWorld().isClient){
            if(entity instanceof SalmonEntity && !user.getItemCooldownManager().isCoolingDown(stack.getItem())){
                Vec3d pos = entity.getPos();
                World world = entity.getWorld();
                ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.SALMON_FILET, new Random().nextInt(1,3)));
                world.spawnEntity(itemEntity);

                user.getItemCooldownManager().set(stack.getItem(), 20);

                entity.setAttacker(user);
                entity.kill();
            }
        }
        return ActionResult.SUCCESS;
    }
}
