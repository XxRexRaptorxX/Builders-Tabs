package xxrexraptorxx.builderstabs.main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/builders-tabs
 **/
@Mod("builderstabs")
public class BuildersTabs {

    public static final String MODID = "builderstabs";
    public static final Logger LOGGER = LogManager.getLogger();


    public BuildersTabs(IEventBus bus) {
        CreativeTab.init(bus);
    }
}
