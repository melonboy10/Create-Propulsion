package me.melonoy10.propulsion.data;

import me.melonoy10.propulsion.PropulsionMod;
import me.melonoy10.propulsion.data.client.ModBlockStateProvider;
import me.melonoy10.propulsion.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = PropulsionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(new ModItemModelProvider(generator, existingFileHelper));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, existingFileHelper);
        generator.addProvider(blockTags);
        generator.addProvider(new ModItemTagsProvider(generator, blockTags, existingFileHelper));

        generator.addProvider(new ModLootTableProvider(generator));
        generator.addProvider(new ModRecipeProvider(generator));
    }
}
