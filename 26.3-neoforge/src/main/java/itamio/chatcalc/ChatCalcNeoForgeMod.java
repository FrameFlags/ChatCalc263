package itamio.chatcalc;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Chat Calc — unofficial 26.3 port (NeoForge). */
@Mod(ChatCalcNeoForgeMod.MOD_ID)
public class ChatCalcNeoForgeMod {
    public static final String MOD_ID = "chatcalc263";
    public static final Logger LOGGER = LoggerFactory.getLogger("Chat Calc");

    public ChatCalcNeoForgeMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("[Chat Calc] initialized on Minecraft 26.3 (NeoForge)");
    }
}
