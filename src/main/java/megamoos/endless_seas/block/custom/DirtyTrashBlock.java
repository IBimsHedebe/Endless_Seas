package megamoos.endless_seas.block.custom;

import megamoos.endless_seas.item.ModItems;
import megamoos.endless_seas.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DirtyTrashBlock extends Block {
    public DirtyTrashBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        world.playSound(player, pos, SoundEvents.BLOCK_AZALEA_BREAK, SoundCategory.BLOCKS, 1f, 1f);

        return ActionResult.SUCCESS;

    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if(entity instanceof ItemEntity ItemEntity){
            if(isValidItem(ItemEntity.getStack())){
                ItemEntity.setStack(new ItemStack(ModItems.TRASH, ItemEntity.getStack().getCount()));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    private boolean isValidItem(ItemStack stack){
        return stack.isIn(ModTags.Items.TRANSFORMABLE_ITEMS);
    }

}
