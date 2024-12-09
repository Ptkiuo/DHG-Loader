package com.ptk671.dhgloader;

import com.ptk671.dhgloader.item.DhgItem;
import com.ptk671.dhgloader.item.DhgItemSettings;
import com.ptk671.dhgloader.itemgroup.DhgItemGroup;
import com.ptk671.dhgloader.registry.DhgRegistry;
import com.ptk671.dhgloader.util.CompatIdentifier;
import net.fabricmc.api.ModInitializer;

public class DhgLoader implements ModInitializer {
	public static DhgItem test = new DhgItem(new DhgItemSettings(CompatIdentifier.of("test","test_item")).maxCount(1));
	public static DhgItemGroup test_group = DhgItemGroup.create(CompatIdentifier.of("test","group")).icon(test).appendItems(DhgLoader.test);

	public static DhgItem test2 = new DhgItem(new DhgItemSettings(CompatIdentifier.of("test","test_item2")).maxCount(1).group(test_group));


	@Override
	public void onInitialize() {
		DhgRegistry.registerItemGroup(test_group);
		DhgRegistry.registerItem(test);
		DhgRegistry.registerItem(test2);

		System.out.println("Hello Fabric world!");

	}
}
