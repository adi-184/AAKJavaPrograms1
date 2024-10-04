package inheritanceandinterface;
//Final class
final class Constants {
 // Final variable
 public static final double PI = 3.14159;

 // Final method
 public final void display() {
     System.out.println("This is a final method.");
 }
}

//Attempting to extend a final class will cause an error
//class ExtendedConstants extends Constants { } // Uncommenting this line will cause a compilation error
public class FinalKeyword {

	public static void main(String[] args) {
		 // Accessing the final variable
        System.out.println("Value of PI: " + Constants.PI);

        // Creating an instance of the final class
        Constants constants = new Constants();
        constants.display();  // Call the final method

	}

}
