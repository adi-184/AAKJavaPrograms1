package inheritanceandinterface;
//Base class
class GeoShape {
 double area() {
     return 0;  // Default implementation
 }
}

//Subclass: Triangle
class Triangle extends GeoShape {
 private double base;
 private double height;

 // Constructor
 Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 double area() {
     return 0.5 * base * height;  // Area formula for triangle
 }
}

//Subclass: Square
class Square extends GeoShape {
 private double side;

 // Constructor
 Square(double side) {
     this.side = side;
 }

 @Override
 double area() {
     return side * side;  // Area formula for square
 }
}

  
public class DynamicBinding {

	public static void main(String[] args) {
		GeoShape myShape;  // Declare a GeoShape reference

        // Assign Triangle object to GeoShape reference
        myShape = new Triangle(5, 10);
        System.out.println("Area of Triangle: " + myShape.area());  // Output: Area of Triangle: 25.0

        // Assign Square object to GeoShape reference
        myShape = new Square(4);
        System.out.println("Area of Square: " + myShape.area());  // Output: Area of Square: 16.0
	}

}
