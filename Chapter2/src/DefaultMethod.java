package inheritanceandinterface;
interface MyInterface {
    // Default method
    default void display() {
        System.out.println("This is a default method in the interface.");
    }
    
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Implementing the abstract method.");
    }
}

public class DefaultMethod {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
        myClass.display(); // Calls the default method
        myClass.show();    // Calls the implemented method

	}

}
