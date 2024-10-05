package inheritanceandinterface;
//Superclass: Fruit
class Fruit {
 String name;

 // Superclass constructor
 Fruit(String name) {
     this.name = name;
 }

 // Superclass method
 void eat() {
     System.out.println("Eating a " + name + ".");
 }
}

//Subclass: Apple (Inherits from Fruit)
class Apple extends Fruit {

 // Subclass constructor
 Apple() {
     super("Apple");  // Call the superclass constructor
 }

 // Subclass method
 void crunch() {
     System.out.println("Crunching the " + name + ".");
 }
}

//Subclass: Banana (Inherits from Fruit)
class Banana extends Fruit {

 // Subclass constructor
 Banana() {
     super("Banana");  // Call the superclass constructor
 }

 // Subclass method
 void peel() {
     System.out.println("Peeling the " + name + ".");
 }
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// Creating objects of Apple and Banana classes
        Apple myApple = new Apple();
        Banana myBanana = new Banana();

        // Call methods from both subclasses
        myApple.eat();    // Inherited from Fruit class
        myApple.crunch(); // Method from Apple class

        myBanana.eat();   // Inherited from Fruit class
        myBanana.peel();  // Method from Banana class

	}

}
