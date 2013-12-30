package garndesh.bm.configuration;

import java.io.File;
import java.util.logging.Level;

import assets.bm.lib.BlockIds;
import assets.bm.lib.Reference;
import assets.bm.lib.Strings;

import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.FMLLog;

public class BlockConfiguration {
	protected static void init(File configFile)
    {

        Configuration blockConfiguration = new Configuration(configFile);

        try
        {
            blockConfiguration.load();

            /* Block configs */
            BlockIds.BASIC_BLOCK = blockConfiguration.getBlock(Strings.BASIC_BLOCK_NAME, BlockIds.BASIC_BLOCK_DEFAULT).getInt(BlockIds.BASIC_BLOCK_DEFAULT);
            
        }
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its block configuration");
        }
        finally
        {
            blockConfiguration.save();
        }
    }
}
