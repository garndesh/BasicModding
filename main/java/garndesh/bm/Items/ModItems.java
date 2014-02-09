package garndesh.bm.Items;

import garndesh.bm.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

	public static Item basicItem;
	
	public static void Init(){
		//Create Items
		basicItem = new BasicItem();
		
		//Register Items with forge
		GameRegistry.registerItem(basicItem, "item."+Strings.BASIC_ITEM_NAME);
	}
}
