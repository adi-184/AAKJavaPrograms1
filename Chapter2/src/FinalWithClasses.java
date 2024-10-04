package inheritanceandinterface;
//Final class
final class FinalClass {
 void displayMessage() {
     System.out.println("This is a final class.");
 }
}

//Regular class
class RegularClass {
 void displayInfo() {
     System.out.println("This is a regular class.");
 }
}

//Attempting to extend the final class will cause a compile-time error
/*
class ExtendedClass extends FinalClass {
 void display() {
     System.out.println("Trying to extend a final class.");
 }
}
*/
public class FinalWithClasses {

	public static void main(String[] args) {
		 FinalClass finalObj = new FinalClass();
	        finalObj.displayMessage();  // Calls method from the final class

	        RegularClass regularObj = new RegularClass();
	        regularObj.displayInfo();    // Calls method from the regular class
	}

}
