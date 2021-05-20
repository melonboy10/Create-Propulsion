package me.melonoy10.propulsion.data;

import me.melonoy10.propulsion.PropulsionMod;
import me.melonoy10.propulsion.setup.ModItems;
import me.melonoy10.propulsion.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator p_i232552_1_, BlockTagsProvider p_i232552_2_, ExistingFileHelper existingFileHelper) {
        super(p_i232552_1_, p_i232552_2_, PropulsionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(ModTags.Blocks.BLOCKS_DOUGH, ModTags.Items.BLOCKS_DOUGH);

//        getOrCreateRawBuilder(ModTags.Items.BLOCKS_DOUGH).add(ModItems.APPLE_PIE.get());
    }
}
