package com.reapersremorse.uto.init;

import com.reapersremorse.uto.UTOMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = UTOMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(UTOMod.MOD_ID)
public class ItemInit
{
    //@ObjectHolder(UTOMod.MOD_ID+"example_item")
    public static final Item example_item = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register <Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
    }
}
