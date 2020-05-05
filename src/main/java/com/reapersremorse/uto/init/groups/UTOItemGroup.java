package com.reapersremorse.uto.init.groups;

import com.reapersremorse.uto.init.BlockInit;
import com.reapersremorse.uto.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class UTOItemGroup  extends ItemGroup
{
    public static final UTOItemGroup instance = new UTOItemGroup(ItemGroup.GROUPS.length,"UTOITEMGROUP");

    private UTOItemGroup(int index, String label)
    {
        super(index,label);
    }
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemInit.uto_generic_dust);
    }
}
