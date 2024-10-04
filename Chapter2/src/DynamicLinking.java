package inheritanceandinterface;
//Interface
interface Shape {
 void draw();  // Abstract method
}

//Class implementing the interface: Circle
class Circle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Circle.");
 }
}

//Class implementing the interface: Rectangle
class Rectangle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle.");
 }
}
public class DynamicLinking {

	public static void main(String[] args) {
		Shape myShape;  // Declare a Shape reference

        // Create a Circle object
        myShape = new Circle();
        myShape.draw();  // Output: Drawing a Circle.

        // Create a Rectangle object
        myShape = new Rectangle();
        myShape.draw();  // Output: Drawing a Rectangle.

	}

}
