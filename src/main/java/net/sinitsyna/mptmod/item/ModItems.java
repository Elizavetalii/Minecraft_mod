package net.sinitsyna.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sinitsyna.mptmod.MptMod;

public class ModItems {

    public static final DeferredRegister<Item>  ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> FLOWER = ITEMS.register("flower",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_TAB)));

    public static final RegistryObject<Item> BOOK = ITEMS.register("book",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_TAB)));

    public static final RegistryObject<Item> ZLO = ITEMS.register("zlo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_TAB)));

    public static final RegistryObject<Item> SVIN = ITEMS.register("svin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_TAB)));

}
