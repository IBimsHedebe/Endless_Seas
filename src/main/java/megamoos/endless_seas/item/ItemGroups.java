package megamoos.endless_seas.item;

import megamoos.endless_seas.EndlessSeas;
import megamoos.endless_seas.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {


    public static final ItemGroup ENDLESS_SEAS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EndlessSeas.MOD_ID, "endless_seas_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TRASH))
                    .displayName(Text.translatable("itemgroup.endless_seas.endless_seas_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.TRASH);
                      entries.add(ModBlocks.TRASH_BLOCK);
                      entries.add(ModBlocks.DIRTY_TRASH_BLOCK);

                    }).build());

    public static void registerItemGroups(){
        EndlessSeas.LOGGER.info("Registering Item Groups for " + EndlessSeas.MOD_ID);
    }

}
