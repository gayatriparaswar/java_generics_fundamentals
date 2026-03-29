package interfacedemo;

/**
 * GenericInterface defines a single-operation contract that accepts a value of type T.
 *
 * @param <T> the type accepted by getValue
 */
public interface GenericInterface<T> {
    /**
     * Handle or process the provided value of type T.
     *
     * @param value the value to process
     */
    void getValue(T value);
}
