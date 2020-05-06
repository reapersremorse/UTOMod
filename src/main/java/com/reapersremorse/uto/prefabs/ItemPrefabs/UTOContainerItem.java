package com.reapersremorse.uto.prefabs.ItemPrefabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UTOContainerItem extends Item
{
    //TODO: make RepairItemRecipe much more elaborate
    public UTOContainerItem
            (Properties properties) { super(properties); }

    @Override
    public boolean hasEffect(ItemStack stack){return true;}

    @Override
    public void setDamage(ItemStack stack, int damage){}

    @Override
    public boolean isRepairable(ItemStack stack) {
        return super.isRepairable(stack);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return super.getIsRepairable(toRepair, repair);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack){return true;}

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (!hasContainerItem(itemStack))
        {
            return ItemStack.EMPTY;
        }
        return new ItemStack(getItem());
    }
}
