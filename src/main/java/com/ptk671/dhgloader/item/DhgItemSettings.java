package com.ptk671.dhgloader.item;

import com.ptk671.dhgloader.itemgroup.DhgItemGroup;
import com.ptk671.dhgloader.util.CompatIdentifier;
import net.minecraft.item.Item;
import net.minecraft.item.itemgroup.ItemGroup;
import net.minecraft.util.Rarity;


public class DhgItemSettings {
     int maxCount = 64;
     ItemGroup itemGroup;
      DhgItemGroup dhgItemGroup;
     int maxDamage;
     boolean maxDamage_boolen = false;
     boolean maxDamageIfAbsent_boolen = false;
     Item recipeRemainder;
     Rarity rarity;
     boolean fireproof_boolen = false;
     int maxDamageIfAbsent;
     boolean Fireproof_boolen = false;
     CompatIdentifier compatIdentifier;

     public DhgItemSettings(CompatIdentifier identifier){
         compatIdentifier = identifier;
     }

    public DhgItemSettings maxCount(int maxcount) {
        this.maxCount = maxcount;
        return this;
    }

    public DhgItemSettings maxDamageIfAbsent(int maxDamageIfAbsent) {
        this.maxDamageIfAbsent_boolen = true;
        this.maxDamageIfAbsent = maxDamageIfAbsent;
        return this;
    }

    public DhgItemSettings maxDamage(int maxDamage) {
        this.maxDamage_boolen = true;
        this.maxDamage = maxDamage;
        return this;
    }

    public DhgItemSettings recipeRemainder(Item recipeRemainder) {
        this.recipeRemainder = recipeRemainder;
        return this;
    }

    public DhgItemSettings group(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
        return this;
    }


    public DhgItemSettings group(DhgItemGroup itemGroup) {
        this.dhgItemGroup = itemGroup;
        return this;
    }

    public DhgItemSettings rarity(Rarity rarity) {
        this.rarity = rarity;
        return this;
    }

    public DhgItemSettings fireproof() {
        //>=1.16
        this.fireproof_boolen = true;
        return this;
    }


}