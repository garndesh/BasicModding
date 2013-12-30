package garndesh.bm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import assets.bm.lib.BlockIds;
import assets.bm.lib.Strings;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block basicBlock;
	
	public static void Init(){
		// Create blocks
		basicBlock = new BasicBlock(BlockIds.BASIC_BLOCK);
		
		//Register Blocks with forge
		GameRegistry.registerBlock(basicBlock, "block."+Strings.BASIC_BLOCK_NAME);
	}
}

