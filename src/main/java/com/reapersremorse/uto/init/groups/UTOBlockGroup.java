package com.reapersremorse.uto.init.groups;

import com.reapersremorse.uto.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class UTOBlockGroup extends ItemGroup
{
    public static final UTOBlockGroup instance = new UTOBlockGroup(ItemGroup.GROUPS.length,"UTOBLOCKSGROUP");

    private UTOBlockGroup(int index, String label)
    {
        super(index,label);
    }
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(BlockInit.uto_block);
    }
}
