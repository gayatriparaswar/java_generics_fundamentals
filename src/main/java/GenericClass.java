public class GenericClass<T> {
    //  one or more type parameters
    //  These type parameters are placeholders that are replaced with specific types when the class is instantiated.
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
