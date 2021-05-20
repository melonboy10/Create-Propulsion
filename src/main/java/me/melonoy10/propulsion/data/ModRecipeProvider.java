package me.melonoy10.propulsion.data;

import me.melonoy10.propulsion.setup.ModBlocks;
import me.melonoy10.propulsion.setup.ModItems;
import net.minecraft.data.*;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.APPLE_PIE.get(), 9)
                .requires(ModBlocks.DOUGH_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.APPLE_PIE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.DOUGH_BLOCK.get())
                .define('#', ModItems.APPLE_PIE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.APPLE_PIE.get()))
                .save(consumer);

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DOUGH_LAYER.get()), ModItems.APPLE_PIE.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.DOUGH_LAYER.get()))
                .save(consumer, "apple_pie_from_smelting");
        CookingRecipeBuilder.cooking(Ingredient.of(ModBlocks.DOUGH_LAYER.get()), ModItems.APPLE_PIE.get(), 0.7f, 100, IRecipeSerializer.SMOKING_RECIPE)
                .unlockedBy("has_item", has(ModBlocks.DOUGH_LAYER.get()))
                .save(consumer, "apple_pie_from_cooking");
    }
}
