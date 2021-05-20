package me.melonoy10.propulsion.setup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> APPLE_PIE = Registration.ITEMS.register("apple_pie", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).rarity(Rarity.EPIC).fireResistant()));

    static void register() {
    }

}
