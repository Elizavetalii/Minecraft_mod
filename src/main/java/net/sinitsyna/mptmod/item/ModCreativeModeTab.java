package net.sinitsyna.mptmod.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MY_TAB = new CreativeModeTab("My Tab"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.FLOWER.get());
        }

    };
}
