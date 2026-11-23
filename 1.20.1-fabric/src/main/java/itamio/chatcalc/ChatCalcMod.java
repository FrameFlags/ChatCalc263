package itamio.chatcalc;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Chat Calc — unofficial 1.20.1 port (Fabric). */
public class ChatCalcMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Chat Calc");

    @Override
    public void onInitialize() {
        LOGGER.info("[Chat Calc] initialized on Minecraft 1.20.1 (Fabric)");
    }
}
