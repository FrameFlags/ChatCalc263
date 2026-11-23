package itamio.chatcalc;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Chat Calc — unofficial 26.3 port (Forge). */
@Mod(ChatCalcMod.MOD_ID)
public class ChatCalcMod {
    public static final String MOD_ID = "chatcalc263";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ChatCalcMod() {
        LOGGER.info("[Chat Calc] initialized on Minecraft 26.3 (Forge)");
    }
}
