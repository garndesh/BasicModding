package garndesh.bm.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import assets.bm.lib.ItemIds;
import assets.bm.lib.Strings;

public class ModItems {

	public static Item basicItem;
	
	public static void Init(){
		//Create Items
		basicItem = new BasicItem(ItemIds.BASIC_ITEM);
		
		//Register Items with forge
		GameRegistry.registerItem(basicItem, "item."+Strings.BASIC_ITEM_NAME);
	}
}
