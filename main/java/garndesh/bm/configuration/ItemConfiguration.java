package garndesh.bm.configuration;

import garndesh.bm.lib.Reference;
import garndesh.bm.lib.Strings;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ItemConfiguration {
	protected static void init(File configFile)
    {

        Configuration itemConfiguration = new Configuration(configFile);

        try
        {
            itemConfiguration.load();

            /* Block configs */
            //ItemIds.BASIC_ITEM = itemConfiguration.getBlock(Strings.BASIC_ITEM_NAME, ItemIds.BASIC_ITEM_DEFAULT).getInt(ItemIds.BASIC_ITEM_DEFAULT);
            
        }
        catch (Exception e)
        {
            FMLLog.severe("%s", Reference.MOD_ID+" has had a problem loading its block configuration");
        	//FMLLog.log(Level.SEVERE," has had a problem loading its block configuration");
        }
        finally
        {
            itemConfiguration.save();
        }
    }
}
