package garndesh.bm.Items;

import garndesh.bm.BasicMinecraftMod;
import assets.bm.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

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
}
