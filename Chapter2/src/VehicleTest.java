package inheritanceandinterface;
//Base class
class Vehicles {
 // Method to be overridden
 public void drive() {
     System.out.println("Driving a vehicle");
 }
}

//Subclass that overrides the drive method
class Cars extends Vehicles {
 // Overriding the drive method
 @Override
 public void drive() {
     System.out.println("Repairing a car");
 }
}
//Main class to test the functionality
public class VehicleTest {

	public static void main(String[] args) {
		// Create an instance of Vehicles and call drive()
        Vehicles vehicle = new Vehicles();
        vehicle.drive(); // Output: Driving a vehicle

        // Create an instance of Cars and call drive()
        Cars car = new Cars();
        car.drive(); // Output: Repairing a car

	}

}
