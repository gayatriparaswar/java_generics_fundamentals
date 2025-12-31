public class Application {
    public static void main(String[] args) {
        // GenericClass with integer type parameters
        GenericClass<Integer> genericClassInt = new GenericClass<>(123);

        // GenericClass with String type parameter
        GenericClass<String> genericClassString = new GenericClass<>("BookStringObject");

        // No casting required when retrieving typed values
        Integer i = genericClassInt.getValue();
        System.out.println("Book instance with Integer type: " + i);

        String boxString = genericClassString.getValue();
        System.out.println("Book instance with String type: " + boxString);

        //Generic class with multiple type parameters in key and value pair example
        GenericClassMultiParameter<String,Integer> genericMultiParam = new GenericClassMultiParameter<>("Age", 25);
        System.out.println("Key: " + genericMultiParam.getKey() + ", Value: " + genericMultiParam.getValue());
    }
}
