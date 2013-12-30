package garndesh.bm.Items;

import garndesh.bm.BasicMinecraftMod;
import garndesh.bm.helper.LogHelper;
import garndesh.bm.lib.BlockIds;
import garndesh.bm.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BasicItem extends Item {

	public BasicItem(int itemId) {
		super(itemId);
		this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BASIC_ITEM_NAME);
		this.setCreativeTab(BasicMinecraftMod.tabsBM);
        maxStackSize = 12;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
	
	//Special functions that are activated when the item is right clicked
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack,World world,EntityPlayer player){
		if(!world.isRemote){ //makes sure this is only done server side.
			int playerX = (int) player.posX;
			int playerY = (int) player.posY;
			int playerZ = (int) player.posZ;
			//LogHelper.info("Player at: "+playerX+" "+playerY+" "+playerZ);
			for(int i = 3; i<20; i++){
				world.setBlock(playerX+i, playerY, playerZ, BlockIds.BASIC_BLOCK);
				world.setBlock(playerX, playerY+i, playerZ, BlockIds.BASIC_BLOCK);
				world.setBlock(playerX, playerY, playerZ+i, BlockIds.BASIC_BLOCK);
				world.setBlock(playerX-i, playerY, playerZ, BlockIds.BASIC_BLOCK);
				world.setBlock(playerX, playerY-i, playerZ, BlockIds.BASIC_BLOCK);
				world.setBlock(playerX, playerY, playerZ-i, BlockIds.BASIC_BLOCK);
			}
		}
		return itemStack;
	}
	
}
