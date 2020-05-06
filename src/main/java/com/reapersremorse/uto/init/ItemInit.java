package com.reapersremorse.uto.init;

import com.reapersremorse.uto.UTOMod;
import com.reapersremorse.uto.init.groups.UTOItemGroup;
import com.reapersremorse.uto.prefabs.ItemPrefabs.UTOContainerItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = UTOMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(UTOMod.MOD_ID)
public class ItemInit
{
    //TODO: add transmogrified elements (kinda like: earth, air, fire, water, spirit , electric)
    //TODO: add crustal of ithecles

    //normal items
    public static final Item uto_generic_apple = null;
    public static final Item uto_generic_bowl = null;
    public static final Item uto_generic_eye = null;
    public static final Item uto_generic_fuel = null;
    public static final Item uto_generic_gem = null;
    public static final Item uto_generic_ingot = null;
    public static final Item uto_generic_nugget = null;
    public static final Item uto_generic_pearl = null;
    public static final Item uto_generic_rod = null;
    public static final Item uto_generic_slime_ball = null;
    public static final Item uto_generic_stick = null;
    public static final Item uto_generic_string = null;
    public static final Item uto_generic_dust = null;
    //covalence dusts
    public static final Item uto_covalence_dust_white = null;
    public static final Item uto_covalence_dust_orange = null;
    public static final Item uto_covalence_dust_magenta = null;
    public static final Item uto_covalence_dust_light_blue = null;
    public static final Item uto_covalence_dust_yellow = null;
    public static final Item uto_covalence_dust_lime = null;
    public static final Item uto_covalence_dust_pink = null;
    public static final Item uto_covalence_dust_gray = null;
    public static final Item uto_covalence_dust_light_gray = null;
    public static final Item uto_covalence_dust_cyan = null;
    public static final Item uto_covalence_dust_purple = null;
    public static final Item uto_covalence_dust_blue = null;
    public static final Item uto_covalence_dust_brown = null;
    public static final Item uto_covalence_dust_green = null;
    public static final Item uto_covalence_dust_red = null;
    public static final Item uto_covalence_dust_black = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register <Item> event)
    {
        //regular items
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance).food(new Food.Builder().setAlwaysEdible().fastToEat().meat().hunger(100).saturation(100.0f).effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.7f).build())).setRegistryName("uto_generic_apple"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_bowl"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_eye"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_fuel"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_gem"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_nugget"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_pearl"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_rod"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_slime_ball"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_stick"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_string"));
        event.getRegistry().register(new Item(new Item.Properties().maxStackSize(64).group(UTOItemGroup.instance)).setRegistryName("uto_generic_dust"));

        //covalence dusts
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_white"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_orange"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_magenta"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_light_blue"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_yellow"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_lime"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_pink"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_gray"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_light_gray"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_cyan"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_purple"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_blue"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_brown"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_green"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_red"));
        event.getRegistry().register(new Item(new Item.Properties().group(UTOItemGroup.instance)).setRegistryName("uto_covalence_dust_black"));
    }
}
