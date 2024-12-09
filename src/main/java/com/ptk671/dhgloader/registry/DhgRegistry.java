package com.ptk671.dhgloader.registry;


import com.ptk671.dhgloader.item.DhgItem;
import com.ptk671.dhgloader.itemgroup.DhgItemGroup;
import net.legacyfabric.fabric.api.registry.v1.RegistryHelper;
import net.legacyfabric.fabric.api.resource.ItemModelRegistry;


public class DhgRegistry {

   public static void registerItem(DhgItem item){
       RegistryHelper.registerItem(item.getItem(),item.getid().toLegacyFabric());
       ItemModelRegistry.registerItemModel(item.getItem(),item.getid().toLegacyFabric());
   }

   public static void registerItemGroup(DhgItemGroup itemGroup){

       itemGroup.build();

   }

}
