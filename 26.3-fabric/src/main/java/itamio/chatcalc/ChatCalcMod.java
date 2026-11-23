package itamio.chatcalc;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Chat Calc — unofficial 26.3 port (Fabric). */
public class ChatCalcMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Chat Calc");

    @Override
    public void onInitialize() {
        LOGGER.info("[Chat Calc] initialized on Minecraft 26.3 (Fabric)");
    }
}
