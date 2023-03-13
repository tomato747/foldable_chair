package com.elementblend.foldable_chair.item;

import com.elementblend.foldable_chair.Foldable_Chair;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Foldable_Chair.MOD_ID);
    public static final RegistryObject<Item> FOLDABLECHAIR = ITEMS.register("foldable_chair",
            () -> new FoldableChairItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
