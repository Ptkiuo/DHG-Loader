package com.ptk671.dhgloader.itemgroup;

import com.ptk671.dhgloader.item.DhgItem;
import com.ptk671.dhgloader.util.CompatIdentifier;
import net.legacyfabric.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.legacyfabric.fabric.api.util.Identifier;
import net.legacyfabric.fabric.impl.item.group.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.itemgroup.ItemGroup;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DhgItemGroup {
     CompatIdentifier compatIdentifier;
     List<ItemStack> stacks3 = new ArrayList<>();

     DhgItem stacks2;
     Text DisplayName;
     ItemGroup itemGroup2;
     CompatIdentifier identifier;
     FabricItemGroupBuilder builder;
     Supplier<ItemStack> iconSupplier;
     DhgItem dhgItem;
    public DhgItemGroup(CompatIdentifier identifier) {
        this.identifier = identifier;
    }

    public static DhgItemGroup create(CompatIdentifier identifier) {
        return new DhgItemGroup(identifier);
    }

    public DhgItemGroup icon(Item item) {
       iconSupplier = () -> new ItemStack(item);
        return this;
    }

    public DhgItemGroup icon(DhgItem dhgItem) {
        this.dhgItem = dhgItem;
        return this;
    }

    public DhgItemGroup appendItems(Item item)
    {
        stacks3.add(new ItemStack(item));
        return this;
    }

    public DhgItemGroup appendItems(DhgItem item)
    {
        AppendItems.add(this,item);
        return this;
    }

    public void build() {

        FabricItemGroupBuilder itemGroupBuilder;
        itemGroupBuilder =  FabricItemGroupBuilder.create(identifier.toLegacyFabric());;
        if(iconSupplier != null) itemGroupBuilder.iconWithItem(() -> new ItemStack(iconSupplier.get().getItem()).getItem());
        if(dhgItem != null) itemGroupBuilder.iconWithItem(() -> new ItemStack(dhgItem.getItem()).getItem());
        if(stacks3 != null) itemGroupBuilder.appendItems(stacks -> {stacks.addAll(stacks3);});
        itemGroup2 = itemGroupBuilder.build();
        builder = itemGroupBuilder;
    }
    public ItemGroup getItemGroup() {
        return itemGroup2;
    }


}
