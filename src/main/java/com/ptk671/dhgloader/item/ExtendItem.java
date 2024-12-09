package com.ptk671.dhgloader.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.CommonI18n;

public class ExtendItem extends Item {

    @Override
    public String getDisplayName(ItemStack stack) {
        return CommonI18n.translate(stack.getTranslationKey().intern());
    }
    @Override
    public Item setMaxDamage(int damage) {
        return super.setMaxDamage(damage);
    }
}
