package inheritanceandinterface;
//Superclass
class Superclass {
 String brand;

 // Constructor of the superclass
 Superclass(String brand) {
     this.brand = brand;
 }

 void displayBrand() {
     System.out.println("Superclass Brand: " + brand);
 }
}

//Subclass
class BaseClass extends Superclass {
 String model;

 // Constructor of the subclass
 BaseClass(String brand, String model) {
     super(brand);  // Call to the superclass constructor
     this.model = model;
 }

 void displayInfo() {
     super.displayBrand();  // Call to the superclass method
     System.out.println("BaseClass Model: " + model);
 }
}
public class MemberofSuperclass {

	public static void main(String[] args) {
		 BaseClass myCar = new BaseClass("Toyota", "Camry");
	        myCar.displayInfo();  // Display the information of the BaseClass object

	}

}
