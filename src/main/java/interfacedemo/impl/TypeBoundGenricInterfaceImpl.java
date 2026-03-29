package interfacedemo.impl;

import interfacedemo.TypeBoundGenricInterface;

/**
 * Implementation of TypeBoundGenricInterface for types that extend Number.
 * This class stores a numeric value of generic type T and provides
 * basic operations such as processing, accessors and a convenience
 * method to get the numeric value as a double.
 *
 * @param <T> a subtype of Number (e.g., Integer, Double, Long)
 */
public class TypeBoundGenricInterfaceImpl<T extends Number> implements TypeBoundGenricInterface<T> {
    /**
     * The numeric value held by this implementation. Must not be null.
     */
    private T number;

    /**
     * Create a new instance that holds the provided number.
     *
     * @param number the number to store; must not be null
     * @throws IllegalArgumentException if number is null
     */
    public TypeBoundGenricInterfaceImpl(T number) {
        if (number == null) {
            throw new IllegalArgumentException("number must not be null");
        }
        this.number = number;
    }

    /**
     * Process the provided number. Implementation here simply prints the value,
     * but callers can use their own implementations of the interface for different behavior.
     *
     * @param number the number to process; if null the method will not attempt to process it
     */
    @Override
    public void processNumber(T number) {
        if (number == null) {
            System.out.println("No number provided to process.");
            return;
        }
        System.out.println("Processing number: " + number);
    }

    /**
     * Get the stored number.
     *
     * @return the stored number (never null)
     */
    public T getNumber() {
        return number;
    }

    /**
     * Set or replace the stored number.
     *
     * @param number the new number to store; must not be null
     * @throws IllegalArgumentException if number is null
     */
    public void setNumber(T number) {
        if (number == null) {
            throw new IllegalArgumentException("number must not be null");
        }
        this.number = number;
    }

    /**
     * Convenience method to obtain the stored number as a primitive double.
     * Useful when consumers need consistent numeric operations regardless of the concrete Number subtype.
     *
     * @return the double value of the stored number
     */
    public double getAsDouble() {
        return number.doubleValue();
    }

    /**
     * Readable representation for debugging/logging.
     *
     * @return string representation including the stored number
     */
    @Override
    public String toString() {
        return "TypeBoundGenricInterfaceImpl{number=" + number + "}";
    }
}
