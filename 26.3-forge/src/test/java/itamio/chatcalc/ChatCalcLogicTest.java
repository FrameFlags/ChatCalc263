package itamio.chatcalc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChatCalcLogicTest {
    @Test void arithmetic() {
        assertEquals(7.0, ChatCalcLogic.evaluate("3+4").orElseThrow(), 1e-9);
        assertEquals(2.0, ChatCalcLogic.evaluate("(10-4)/3").orElseThrow(), 1e-9);
        assertEquals(14.0, ChatCalcLogic.evaluate("2*3+8").orElseThrow(), 1e-9);
    }
    @Test void rejectsBadInput() {
        assertTrue(ChatCalcLogic.evaluate("2+").isEmpty());
        assertTrue(ChatCalcLogic.evaluate("1/0").isEmpty() || Double.isInfinite(ChatCalcLogic.evaluate("1/0").orElse(0)));
        assertTrue(ChatCalcLogic.evaluate("").isEmpty());
        assertTrue(ChatCalcLogic.evaluate(null).isEmpty());
    }
}
