package me.melonoy10.propulsion.setup;

import me.melonoy10.propulsion.PropulsionMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    public static final class Blocks {
        public static final ITag.INamedTag<Block> BLOCKS_DOUGH = mod("doughs");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.createOptional(new ResourceLocation(PropulsionMod.MOD_ID, path));
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> BLOCKS_DOUGH = mod("doughs");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.createOptional(new ResourceLocation(PropulsionMod.MOD_ID, path));
        }
    }
}
