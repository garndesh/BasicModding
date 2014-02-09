package garndesh.bm;

// Thanks to pahimar and his modding tutorials.

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import garndesh.bm.Items.ModItems;
import garndesh.bm.blocks.ModBlocks;
import garndesh.bm.configuration.ConfigurationHandler;
import garndesh.bm.lib.Reference;
import garndesh.bm.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME)
//@NetworkMod(channels = {Reference.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class) //needed before 1.7
public class BasicMinecraftMod {

	//Instance of the mod you are making
    @Instance(Reference.MOD_ID)
    public static BasicMinecraftMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    //Add a creative tab
    public static CreativeTabs tabsBM = new CreativeTabs(Reference.MOD_ID){
        //private static final String __OBFID = "CL_00000009";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ModItems.basicItem;
        }
    };

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
    	
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // set version number
        event.getModMetadata().version = Reference.VERSION_NUMBER;

        // Initialize the configuration{
        ConfigurationHandler.init(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME.toLowerCase() + File.separator);

        //Init blocks
        ModBlocks.Init();
        
        //Init Items
        ModItems.Init();
    }
    
    
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
    	
    }
    
}
