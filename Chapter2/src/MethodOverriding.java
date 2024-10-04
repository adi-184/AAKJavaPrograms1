package inheritanceandinterface;
//Superclass: Subject
class Subject {
 void study() {
     System.out.println("Studying a subject...");
 }
}

//Subclass: Math (Overrides the study() method)
class Math extends Subject {
 @Override
 void study() {
     System.out.println("Studying Math: Focus on numbers and equations.");
 }
}

//Subclass: Science (Overrides the study() method)
class Science extends Subject {
 @Override
 void study() {
     System.out.println("Studying Science: Focus on experiments and theories.");
 }
}

public class MethodOverriding {

	public static void main(String[] args) {
		 // Create objects of Math and Science classes
        Subject myMath = new Math();
        Subject myScience = new Science();

        // Call the overridden methods
        myMath.study();     // Output: Studying Math: Focus on numbers and equations.
        myScience.study();  // Output: Studying Science: Focus on experiments and theories.

	}

}
