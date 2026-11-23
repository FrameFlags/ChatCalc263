package itamio.chatcalc;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Chat Calc — unofficial 1.20.1 port (Forge). */
@Mod(ChatCalcMod.MOD_ID)
public class ChatCalcMod {
    public static final String MOD_ID = "chatcalc263_1201";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ChatCalcMod() {
        LOGGER.info("[Chat Calc] initialized on Minecraft 1.20.1 (Forge)");
    }
}
