package me.melonoy10.propulsion.data.client;

import me.melonoy10.propulsion.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static me.melonoy10.propulsion.PropulsionMod.MOD_ID;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.DOUGH_BLOCK.get());
        simpleBlock(ModBlocks.DOUGH_LAYER.get());
    }
}
