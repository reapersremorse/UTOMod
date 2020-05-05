package com.reapersremorse.uto.init;

import com.reapersremorse.uto.UTOMod;
import com.reapersremorse.uto.init.groups.UTOBlockGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = UTOMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(UTOMod.MOD_ID)
public class BlockInit
{
    //TODO: block,bricks,chiseled bricks, cobble, cracked, end, smooth, stone
    public static final Block uto_block = null;
    public static final Block uto_bricks = null;
    public static final Block uto_chiseled_bricks = null;
    public static final Block uto_cobblestone = null;
    public static final Block uto_cracked_bricks = null;
    public static final Block uto_end_stone = null;
    public static final Block uto_ore = null;
    public static final Block uto_smooth = null;
    public static final Block uto_stone = null;

    public static final Block uto_covalence_block_white = null;
    public static final Block uto_covalence_block_orange = null;
    public static final Block uto_covalence_block_magenta = null;
    public static final Block uto_covalence_block_light_blue = null;
    public static final Block uto_covalence_block_yellow = null;
    public static final Block uto_covalence_block_lime = null;
    public static final Block uto_covalence_block_pink = null;
    public static final Block uto_covalence_block_gray = null;
    public static final Block uto_covalence_block_light_gray = null;
    public static final Block uto_covalence_block_cyan = null;
    public static final Block uto_covalence_block_purple = null;
    public static final Block uto_covalence_block_blue = null;
    public static final Block uto_covalence_block_brown = null;
    public static final Block uto_covalence_block_green = null;
    public static final Block uto_covalence_block_red = null;
    public static final Block uto_covalence_block_black = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register <Block>event)
    {
        //basic blocks
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_bricks"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_chiseled_bricks"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_cobblestone"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_cracked_bricks"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_end_stone"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_smooth"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_stone"));

        //covalence dusts blocks
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_white"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_orange"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_magenta"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_light_blue"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_yellow"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_lime"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_pink"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_gray"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_light_gray"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_cyan"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_purple"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_blue"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_brown"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_green"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_red"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1,1.0f).harvestLevel(0).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("uto_covalence_block_black"));

    }
    @SubscribeEvent
    public static void registerItemBlocks(final RegistryEvent.Register <Item>event)
    {
        //basic blocks
        event.getRegistry().register(new BlockItem(uto_block,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_block"));
        event.getRegistry().register(new BlockItem(uto_bricks,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_bricks"));
        event.getRegistry().register(new BlockItem(uto_chiseled_bricks,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_chiseled_bricks"));
        event.getRegistry().register(new BlockItem(uto_cobblestone,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_cobblestone"));
        event.getRegistry().register(new BlockItem(uto_cracked_bricks,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_cracked_bricks"));
        event.getRegistry().register(new BlockItem(uto_end_stone,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_end_stone"));
        event.getRegistry().register(new BlockItem(uto_ore,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_ore"));
        event.getRegistry().register(new BlockItem(uto_smooth,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_smooth"));
        event.getRegistry().register(new BlockItem(uto_stone,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_stone"));

        //covalence dusts blocks
        event.getRegistry().register(new BlockItem(uto_covalence_block_white,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_white"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_orange,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_orange"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_magenta,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_magenta"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_light_blue,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_light_blue"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_yellow,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_yellow"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_lime,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_lime"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_pink,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_pink"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_gray,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_gray"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_light_gray,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_light_gray"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_cyan,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_cyan"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_purple,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_purple"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_blue,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_blue"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_brown,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_brown"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_green,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_green"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_red,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_red"));
        event.getRegistry().register(new BlockItem(uto_covalence_block_black,new Item.Properties().group(UTOBlockGroup.instance)).setRegistryName("uto_covalence_block_black"));

    }

}
