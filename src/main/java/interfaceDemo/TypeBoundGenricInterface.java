package interfaceDemo;

/**
 * TypeBoundGenricInterface restricts its type parameter to Number and subtypes.
 * It is useful when the interface operations make numeric assumptions (e.g., arithmetic).
 *
 * @param <T> a Number subtype such as Integer, Double, Long
 */
public interface TypeBoundGenricInterface<T extends Number> {
    /**
     * Process a numeric value of type T. Implementations decide what processing means.
     *
     * @param number the numeric value to process
     */
    void processNumber(T number);
}
