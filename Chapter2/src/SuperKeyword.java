package inheritanceandinterface;
//Base class
class Vehicle {
 String brand;

 // Constructor of the base class
 Vehicle(String brand) {
     this.brand = brand;
 }

 void display() {
     System.out.println("Vehicle Brand: " + brand);
 }
}

//Subclass
class Car extends Vehicle {
 int year;

 // Constructor of the subclass
 Car(String brand, int year) {
     super(brand);  // Call to the parent class constructor
     this.year = year;
 }

 void display() {
     super.display();  // Call to the parent class method
     System.out.println("Year: " + year);
 }
}
public class SuperKeyword {

	public static void main(String[] args) {
		Car myCar = new Car("Toyota", 2020);
        myCar.display();  // Display the information of the car

	}

}
