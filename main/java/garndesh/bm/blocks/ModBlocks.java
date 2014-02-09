package garndesh.bm.blocks;

import garndesh.bm.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block basicBlock;
	
	public static void Init(){
		// Create blocks
		basicBlock = new BasicBlock();
		
		//Register Blocks with forge
		GameRegistry.registerBlock(basicBlock, "block."+Strings.BASIC_BLOCK_NAME);
	}
}

