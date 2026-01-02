package interfacedemo.impl;

import interfacedemo.GenericInterface;

/**
 * Generic implementation of GenericInterface that can be parameterized by T.
 * Demonstrates an implementation that stores a value and can return it.
 *
 * @param <T> the concrete type handled by this implementation
 */
public class GenericInterfaceWithGenericClass<T> implements GenericInterface<T> {
    // Stored value of type T.
    private T value;

    public GenericInterfaceWithGenericClass(T value) {
        this.value = value;
    }

    /**
     * Print the provided value. This method implements the interface contract.
     *
     * @param value the value to display
     */
    @Override
    public void getValue(T value) {
        System.out.println("GenericInterfaceWithGenericClass Value: " + value);
    }

    /**
     * Return the stored value of this instance.
     *
     * @return the stored value of type T
     */
    public T getStoredValue() {
        return value;
    }
}
