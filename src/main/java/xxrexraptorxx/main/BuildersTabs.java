package xxrexraptorxx.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/builders-tabs
 **/
@Mod("builderstabs")
public class BuildersTabs {

    public static final String MODID = "builderstabs";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab mainTab = new MainTab();
    public static final CreativeModeTab headTab = new HeadTab();

}
