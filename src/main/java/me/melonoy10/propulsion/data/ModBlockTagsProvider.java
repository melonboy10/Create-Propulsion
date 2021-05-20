package me.melonoy10.propulsion.data;

import me.melonoy10.propulsion.PropulsionMod;
import me.melonoy10.propulsion.setup.ModBlocks;
import me.melonoy10.propulsion.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, PropulsionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.BLOCKS_DOUGH).add(ModBlocks.DOUGH_BLOCK.get()).add(ModBlocks.DOUGH_LAYER.get());


    }
}