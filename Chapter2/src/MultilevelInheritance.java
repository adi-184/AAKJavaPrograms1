package inheritanceandinterface;
//Superclass: Tree
class Tree {
 String type;

 // Superclass constructor
 Tree(String type) {
     this.type = type;
 }

 // Superclass method
 void grow() {
     System.out.println("The " + type + " tree is growing.");
 }
}

//Subclass: FruitTree (Inherits from Tree)
class FruitTree extends Tree {

 // Subclass constructor
 FruitTree(String type) {
     super(type);  // Call the superclass constructor
 }

 // Subclass method
 void produceFruit() {
     System.out.println("The " + type + " tree is producing fruit.");
 }
}

//Subclass: AppleTree (Inherits from FruitTree)
class AppleTree extends FruitTree {

 // Subclass constructor
 AppleTree() {
     super("Apple");  // Call the superclass constructor
 }

 // Subclass method
 void harvest() {
     System.out.println("The apples are ready for harvest.");
 }
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// Creating an object of the AppleTree class
        AppleTree myAppleTree = new AppleTree();

        // Call methods from all classes in the inheritance chain
        myAppleTree.grow();         // Inherited from Tree class
        myAppleTree.produceFruit(); // Inherited from FruitTree class
        myAppleTree.harvest();      // Method from AppleTree class

	}

}
