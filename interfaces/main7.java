// Define a public interface with fields and a method
public interface MyInterface {
    // Fields with assigned values (constants in interfaces are implicitly public, static, and final)
    String NAME = "Interface Example";
    int VALUE = 42;

    // Abstract method
    void showMessage();
}

// Implementing class
class MyClass implements MyInterface {
    @Override
    public void showMessage() {
        System.out.println("Hello, this is the interface method.");
    }
}

// Main class to run the program
public class main7 {
}