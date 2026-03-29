package genericwithconstructor;

public class GenericConstructorExample {

    public <U> GenericConstructorExample(U value){
        System.out.println("Message is:" + value);
    }

    public <A, B> GenericConstructorExample(A number1, B number2){
        System.out.println("first" + number1 + "Second" +number2);
    }

    public <U extends Number> GenericConstructorExample(U value){
        System.out.println("Message is:" + value);
    }

}