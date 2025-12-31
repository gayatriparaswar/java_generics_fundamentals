public class GenericClassMultiParameter<K, V> {
    private K key;
    private V value;

    public GenericClassMultiParameter(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}
