package itamio.chatcalc;

import java.util.OptionalDouble;

/** Safe arithmetic evaluator for chat input — no scripting engine, no eval. */
public final class ChatCalcLogic {
    private ChatCalcLogic() {}

    /** Evaluates + - * / and parentheses; returns empty for invalid input. */
    public static OptionalDouble evaluate(String input) {
        if (input == null) return OptionalDouble.empty();
        try {
            Parser p = new Parser(input.trim());
            double value = p.expression();
            if (!p.atEnd()) return OptionalDouble.empty();
            return OptionalDouble.of(value);
        } catch (RuntimeException e) {
            return OptionalDouble.empty();
        }
    }

    private static final class Parser {
        private final String s;
        private int i;
        Parser(String s) { this.s = s; }
        boolean atEnd() { return i >= s.length(); }
        double expression() {
            double v = term();
            while (!atEnd() && (charAt() == '+' || charAt() == '-')) {
                char op = s.charAt(i++);
                double r = term();
                v = (op == '+') ? v + r : v - r;
            }
            return v;
        }
        double term() {
            double v = factor();
            while (!atEnd() && (charAt() == '*' || charAt() == '/')) {
                char op = s.charAt(i++);
                double r = factor();
                if (op == '/' && r == 0.0) throw new ArithmeticException("divide by zero");
                v = (op == '*') ? v * r : v / r;
            }
            return v;
        }
        double factor() {
            if (atEnd()) throw new IllegalArgumentException("empty");
            if (charAt() == '(') {
                i++;
                double v = expression();
                if (atEnd() || charAt() != ')') throw new IllegalArgumentException("unbalanced");
                i++;
                return v;
            }
            int start = i;
            while (!atEnd() && (Character.isDigit(charAt()) || charAt() == '.')) i++;
            if (start == i) throw new IllegalArgumentException("number expected");
            return Double.parseDouble(s.substring(start, i));
        }
        char charAt() { return s.charAt(i); }
    }
}
