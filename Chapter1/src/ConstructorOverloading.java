package chapterno1;
//Class representing a Rectangle
class Rectangle {
 private double length;
 private double width;

 // Constructor with two parameters
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Constructor with one parameter (for a square)
 public Rectangle(double side) {
     this.length = side;
     this.width = side; // Both sides are equal for a square
 }
//Method to calculate area
 public double calculateArea() {
     return length * width;
 }

 // Method to display rectangle details
 public void displayDetails() {
     System.out.println("Length: " + length);
     System.out.println("Width: " + width);
     System.out.println("Area: " + calculateArea());
 }
}
//Main class
public class ConstructorOverloading {

	public static void main(String[] args) {
		// Create instances of the Rectangle class
        Rectangle rectangle1 = new Rectangle(10.0, 5.0); // Rectangle
        Rectangle rectangle2 = new Rectangle(4.0); // Square

        // Display details of both rectangles
        System.out.println("Rectangle 1 Details:");
        rectangle1.displayDetails();
        System.out.println(); // Print a blank line

        System.out.println("Rectangle 2 Details (Square):");
        rectangle2.displayDetails();
	}

}
