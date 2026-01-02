package genericclassexamples;

/**
 * GenericClassExamples.GenericClass is a simple generic container that holds a single value of type T.
 *
 * @param <T> the type of the value stored (e.g., Integer, String, custom types)
 */
public class GenericClass<T> {
    // The stored value. Type parameter T defines the concrete type at instantiation.
    private T value;

    /**
     * Create a new GenericClassExamples.GenericClass holding the provided value.
     *
     * @param value the initial value to store (may be null)
     */
    public GenericClass(T value) {
        this.value = value;
    }

    /**
     * Retrieve the stored value without casting.
     *
     * @return the stored value of type T
     */
    public T getValue() {
        return value;
    }

}
