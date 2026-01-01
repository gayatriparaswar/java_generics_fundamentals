/**
 * GenericClassMultiParameter demonstrates a generic type with two parameters:
 * K for key and V for value.
 *
 * @param <K> the type used for the key
 * @param <V> the type used for the value
 */
public class GenericClassMultiParameter<K, V> {
    // Pair fields whose types are provided by the type parameters.
    private K key;
    private V value;

    /**
     * Construct a key-value pair container.
     *
     * @param key   the key value (may be null)
     * @param value the associated value (may be null)
     */
    public GenericClassMultiParameter(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Return the key stored in this pair.
     *
     * @return the key of type K
     */
    public K getKey() {
        return key;
    }

    /**
     * Return the value stored in this pair.
     *
     * @return the value of type V
     */
    public V getValue() {
        return value;
    }

}
