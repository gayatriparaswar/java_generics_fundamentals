import enumwithgenmerics.EnumWithGenericInterfaceImpl;
import enumwithgenmerics.EnumWithGenericMethod;
import genericclassexamples.GenericClass;
import genericclassexamples.GenericClassMultiParameter;
import interfacedemo.GenericInterface;
import interfacedemo.GenericInterfaceMultipleParameters;
import interfacedemo.TypeBoundGenricInterface;
import interfacedemo.impl.GenericInterfaceImpl;
import interfacedemo.impl.GenericInterfaceMultipleParametersImpl;
import interfacedemo.impl.TypeBoundGenricInterfaceImpl;

/**
 * Demo application that exercises generic classes, interfaces, and an enum utility.
 * The examples are intentionally simple: they show how type parameters provide
 * compile-time safety and remove the need for casts.
 *
 * No business logic is performed here — this class exists to demonstrate usage patterns.
 */
public class Application {
    /**
     * Entry point that runs several small examples:
     * - single-parameter generic container (GenericClass)
     * - two-parameter generic container (GenericClassMultiParameter)
     * - generic interface implementations (single and multi-parameter)
     * - a type-bounded generic interface implementation (Number bound)
     * - enum-based generic methods demonstrating numeric operations
     *
     * Each example prints results to stdout for easy inspection.
     */
    public static void main(String[] args) {
        // Example: GenericClass<T> with Integer — typed storage, no casts required.
        GenericClass<Integer> genericClassInt = new GenericClass<>(123);

        // Example: GenericClass<T> with String — demonstrates reusing the same class with different T.
        GenericClass<String> genericClassString = new GenericClass<>("BookStringObject");

        // Retrieve typed values directly from the generic containers.
        Integer i = genericClassInt.getValue();
        System.out.println("Book instance with Integer type: " + i);

        String boxString = genericClassString.getValue();
        System.out.println("Book instance with String type: " + boxString);

        // Example: GenericClassMultiParameter<K,V> — a simple key/value pair container.
        GenericClassMultiParameter<String,Integer> genericMultiParam = new GenericClassMultiParameter<>("Age", 25);
        System.out.println("Key: " + genericMultiParam.getKey() + ", Value: " + genericMultiParam.getValue());

        // Example: GenericInterface<T> implemented by GenericInterfaceImpl (concrete T = String).
        // Shows how implementations bind the type parameter to a concrete type.
        GenericInterface genericInterface = new GenericInterfaceImpl("GenericsInterfaceImplValue");
        genericInterface.getValue("Hello Generic Interface");

        // Example: GenericInterfaceMultipleParameters<K,V> with an implementation that prints key/value.
        GenericInterfaceMultipleParameters genericInterfaceMultipleParameters = new GenericInterfaceMultipleParametersImpl("GenericsKey","GenericsValue");
        genericInterfaceMultipleParameters.displayKeyValue("SampleKey","SampleValue");

        // Example: TypeBoundGenricInterface<T extends Number> — numeric bound ensures numeric operations are safe.
        TypeBoundGenricInterface typeBoundGenricInterface = new TypeBoundGenricInterfaceImpl(100);
        typeBoundGenricInterface.processNumber(200);

        // Enum with generic methods demonstrating numeric operations (operate returns double).
        double result1 = EnumWithGenericMethod.ADD.operate(5, 10.5);
        System.out.println("Addition Result: " + result1);

        double result2 = EnumWithGenericMethod.SUBTRACT.operate(20.0, 4);
        System.out.println("Subtraction Result: " + result2);

        //Enum Generic with the interfcae
        int result = EnumWithGenericInterfaceImpl.ADDITION.calculate(12,23);
        System.out.println("Enum with Interface Addition Result: " + result);

        int resultMul = EnumWithGenericInterfaceImpl.SUBTRACTION.calculate(6,7);
        System.out.println("Enum with Interface Multiplication Result: " + resultMul);

    }
}
