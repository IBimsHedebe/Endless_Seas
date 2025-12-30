package megamoos.endless_seas.item;

import megamoos.endless_seas.EndlessSeas;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TRASH = registerItem("trash", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(EndlessSeas.MOD_ID, name), item);
    }

    public static void registerModItems(){
        EndlessSeas.LOGGER.info("Registering Mod Items for " + EndlessSeas.MOD_ID);
    }

}
