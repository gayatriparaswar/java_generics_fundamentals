package interfaceDemo.impl;

import interfaceDemo.GenericInterfaceMultipleParameters;

/**
 * Implementation of GenericInterfaceMultipleParameters that simply prints a key/value pair.
 *
 * @param <K> concrete key type used by this instance
 * @param <V> concrete value type used by this instance
 */
public class GenericInterfaceMultipleParametersImpl<K,V> implements GenericInterfaceMultipleParameters<K,V> {

    // Stored sample key/value to show implementations can keep state.
    private K key;
    private V value;

    public GenericInterfaceMultipleParametersImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Print the provided key and value. Implementation respects types K and V.
     *
     * @param key   the key to display
     * @param value the value to display
     */
    @Override
    public void displayKeyValue(K key, V value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}
