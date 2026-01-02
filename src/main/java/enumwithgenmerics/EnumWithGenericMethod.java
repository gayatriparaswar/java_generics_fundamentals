package enumwithgenmerics;

/**
 * Enum representing simple binary arithmetic operations.
 *
 * Each enum constant implements the operate(...) generic helper which accepts
 * two operands of (potentially) different numeric types. Operands are converted
 * to double for the operation so numeric widening is handled consistently.
 *
 * Note: The method expects that provided arguments are instances of Number;
 * otherwise a ClassCastException will be thrown at runtime.
 */
public enum EnumWithGenericMethod {

    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    /**
     * Perform the arithmetic operation represented by this enum constant.
     *
     * @param <T> first operand type (expected to be a subclass of Number at runtime)
     * @param <U> second operand type (expected to be a subclass of Number at runtime)
     * @param a   first operand
     * @param b   second operand
     * @return result of the operation as a double (consistent numeric representation)
     * @throws ClassCastException       if either operand is not a Number
     * @throws ArithmeticException      if division by zero is attempted
     * @throws UnsupportedOperationException if the enum constant is unknown
     */
    public <T, U> double operate(T a, U b) {
        // Convert operands to double using Number.doubleValue(); caller must supply Number types.
        double num1 = ((Number) a).doubleValue();
        double num2 = ((Number) b).doubleValue();

        switch (this) {
            case ADD:
                // Addition of the two numeric values.
                return num1 + num2;
            case SUBTRACT:
                // Subtraction (a - b).
                return num1 - num2;
            case MULTIPLY:
                // Multiplication of the two numeric values.
                return num1 * num2;
            case DIVIDE:
                // Defensive check to prevent division by zero.
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                // Defensive programming: should not happen unless enum is extended incorrectly.
                throw new UnsupportedOperationException("Unknown operation " + this);
        }
    }

}