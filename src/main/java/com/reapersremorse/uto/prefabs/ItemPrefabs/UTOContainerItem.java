package com.reapersremorse.uto.prefabs.ItemPrefabs;

import com.reapersremorse.uto.init.ItemInit;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class UTOContainerItem extends Item
{
    //TODO: make it so i can change all attributes of an item aswell as add tooltips to items in 1 line of code in the init class.
    public UTOContainerItem
            (Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
