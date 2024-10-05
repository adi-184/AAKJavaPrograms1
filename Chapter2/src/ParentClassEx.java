package inheritanceandinterface;
//Parent class
class A {
 public void display() {
     System.out.println("This is the parent class A.");
 }
}

//Subclass
class B extends A {
 @Override
 public void display() {
     System.out.println("This is the subclass B, overriding method from A.");
 }
}
public class ParentClassEx {

	public static void main(String[] args) {
		// Creating an object of the parent class
        A parent = new A();
        parent.display(); // Calls method from class A

        // Creating an object of the subclass
        B child = new B();
        child.display(); // Calls overridden method from class B

	}

}
