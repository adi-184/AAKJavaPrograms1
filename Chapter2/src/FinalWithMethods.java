package inheritanceandinterface;
//Base class
class Calculator {
 // A final method that cannot be overridden
 final void displayMessage() {
     System.out.println("This is a final method in the Calculator class.");
 }

 // A regular method
 void add(int a, int b) {
     System.out.println("Sum: " + (a + b));
 }
}

//Subclass
class AdvancedCalculator extends Calculator {
 // Trying to override the final method will cause a compile-time error
 /*
 void displayMessage() {
     System.out.println("Trying to override final method.");
 }
 */

 // A method specific to the AdvancedCalculator
 void multiply(int a, int b) {
     System.out.println("Product: " + (a * b));
 }
}
public class FinalWithMethods {

	public static void main(String[] args) {
		AdvancedCalculator calc = new AdvancedCalculator();
        calc.displayMessage();  // Calls the final method from Calculator
        calc.add(5, 3);        // Calls the add method from Calculator
        calc.multiply(5, 3);   // Calls the multiply method from AdvancedCalculator

	}

}
