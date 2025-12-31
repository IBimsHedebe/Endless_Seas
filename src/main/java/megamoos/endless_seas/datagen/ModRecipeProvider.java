package megamoos.endless_seas.datagen;

import megamoos.endless_seas.block.ModBlocks;
import megamoos.endless_seas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TRASH_BLOCK, 1)
                .input(ModItems.TRASH, 4)
                .criterion(hasItem(ModItems.TRASH), conditionsFromItem(ModItems.TRASH))
                .offerTo(recipeExporter);
    }
}
