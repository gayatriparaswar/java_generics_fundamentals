import interfaceDemo.GenericInterface;
import interfaceDemo.GenericInterfaceMultipleParameters;
import interfaceDemo.impl.GenericInterfaceImpl;
import interfaceDemo.impl.GenericInterfaceMultipleParametersImpl;

/**
 * Small runner to demonstrate usage of generic classes and generic interfaces.
 * Examples show type-safe storage and interface implementations with concrete types.
 */
public class Application {
    public static void main(String[] args) {
        // GenericClass with Integer type parameter: typed storage, no casts needed.
        GenericClass<Integer> genericClassInt = new GenericClass<>(123);

        // GenericClass with String type parameter.
        GenericClass<String> genericClassString = new GenericClass<>("BookStringObject");

        // Retrieve typed values directly.
        Integer i = genericClassInt.getValue();
        System.out.println("Book instance with Integer type: " + i);

        String boxString = genericClassString.getValue();
        System.out.println("Book instance with String type: " + boxString);

        // Generic class with two type parameters (key and value).
        GenericClassMultiParameter<String,Integer> genericMultiParam = new GenericClassMultiParameter<>("Age", 25);
        System.out.println("Key: " + genericMultiParam.getKey() + ", Value: " + genericMultiParam.getValue());

        // Generic interface implemented for String; method demonstrates typed parameter usage.
        GenericInterface genericInterface = new GenericInterfaceImpl("GenericsInterfaceImplValue");
        genericInterface.getValue("Hello Generic Interface");

        // Generic interface with multiple parameters: implementation shows how K and V can be used.
        GenericInterfaceMultipleParameters genericInterfaceMultipleParameters = new GenericInterfaceMultipleParametersImpl("GenericsKey","GenericsValue");
        genericInterfaceMultipleParameters.displayKeyValue("SampleKey","SampleValue");
    }
}
