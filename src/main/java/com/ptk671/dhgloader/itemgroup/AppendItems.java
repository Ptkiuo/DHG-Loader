package com.ptk671.dhgloader.itemgroup;

import com.ptk671.dhgloader.item.DhgItem;
import com.ptk671.dhgloader.item.ExtendItem;

public class AppendItems {
    public static void add(DhgItemGroup itemGroup,DhgItem item){
        ExtendItem item1 = item.getItem();
        itemGroup.appendItems(item1);
    }
}
