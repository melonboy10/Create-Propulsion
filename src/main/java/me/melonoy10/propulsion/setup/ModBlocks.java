package me.melonoy10.propulsion.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import org.apache.http.config.Registry;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> DOUGH_BLOCK = register("dough_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 10)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

//    public static final RegistryObject<Block> DOUGH_BLOCK = register("dough_block", () ->
//            new Block(AbstractBlock.Properties.of(Material.CAKE).harvestLevel(2).strength(3, 10).sound(SoundType.FUNGUS).jumpFactor(10).harvestTool(ToolType.HOE)));

    public static final RegistryObject<Block> DOUGH_LAYER = register("dough_layer", () ->
            new Block(AbstractBlock.Properties.of(Material.CAKE).strength(3, 10).sound(SoundType.FUNGUS).jumpFactor(10)));

    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}
