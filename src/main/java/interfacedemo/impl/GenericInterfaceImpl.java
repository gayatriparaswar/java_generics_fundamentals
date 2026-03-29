package interfacedemo.impl;

import interfacedemo.GenericInterface;

/**
 * Concrete implementation of GenericInterface for String values.
 * Shows a simple example where the implementation simply prints the provided value.
 */
public class GenericInterfaceImpl implements GenericInterface<String> {

    // Optional stored value demonstrating that implementations can hold state.
    private String value;

    public GenericInterfaceImpl(String value) {
        this.value = value;
    }

    /**
     * Print the provided String value. This method demonstrates the contract
     * specified by GenericInterface with a concrete type.
     *
     * @param value the String to print
     */
    @Override
    public void getValue(String value) {
        System.out.println("GenericInterfaceImpl Value: " + value);
    }

}
