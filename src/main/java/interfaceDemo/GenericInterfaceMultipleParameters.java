package interfaceDemo;

/**
 * GenericInterfaceMultipleParameters demonstrates an interface that accepts
 * two type parameters for operations that involve a key-value pair.
 *
 * @param <K> type of the key parameter
 * @param <V> type of the value parameter
 */
public interface GenericInterfaceMultipleParameters<K,V>{
    /**
     * Display or process a key-value pair.
     *
     * @param key   the key of type K
     * @param value the value of type V
     */
    void displayKeyValue(K key, V value);
}
