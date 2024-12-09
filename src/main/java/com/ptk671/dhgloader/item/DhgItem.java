package com.ptk671.dhgloader.item;

import com.ptk671.dhgloader.itemgroup.AppendItems;
import com.ptk671.dhgloader.util.CompatIdentifier;
import net.minecraft.item.Item;

public class DhgItem {
    private final DhgItemSettings settings;
    private final ExtendItem item = new ExtendItem();
    private Item vanillaItem;
    private DhgItem dhgItem;
    ExtendItem BuiledItem;

    public DhgItemSettings settings() {
        return settings;
    }

    public CompatIdentifier getid(){

        return settings.compatIdentifier;
    }

    public ExtendItem build(DhgItem dhgItem) {
        this.dhgItem = dhgItem;
        item.setMaxCount(settings.maxCount);
        if (settings.itemGroup != null) item.setItemGroup(settings.itemGroup);
        if (settings.recipeRemainder != null)  item.setRecipeRemainder(settings.recipeRemainder);
        if (settings.maxDamage_boolen) item.setMaxDamage(settings.maxDamage);
      return item;
    }

    public DhgItem(DhgItemSettings settings){this.settings = settings;
       this.build(this);
        if (settings.dhgItemGroup != null) AppendItems.add(settings.dhgItemGroup,dhgItem);
    }

    public ExtendItem getItem() {
        return item;
    }

    public Item getVanillaItem(DhgItem dhgItem){
        vanillaItem = item;
        return vanillaItem;
    }
}
