package inheritanceandinterface;
//Parent class
class Y {
 public void show() {
     System.out.println("This is the parent class Y.");
 }
}

//Child class
class X extends Y {
 @Override
 public void show() {
     System.out.println("This is the child class X, overriding method from Y.");
 }
}

public class ChildClassEx {

	public static void main(String[] args) {
		// Creating an object of the parent class
        Y parent = new Y();
        parent.show(); // Calls method from class Y

        // Creating an object of the child class
        X child = new X();
        child.show(); // Calls overridden method from class X

	}

}
