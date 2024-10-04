package inheritanceandinterface;
//Base class
class Primary {
 String name;

 // Constructor of the base class
 Primary(String name) {
     this.name = name;
 }

 void display() {
     System.out.println("Primary Name: " + name);
 }
}

//Subclass
class Secondary extends Primary {
 String subject;

 // Constructor of the subclass
 Secondary(String name, String subject) {
     super(name);  // Call to the parent class constructor
     this.subject = subject;
 }

 void display() {
     super.display();  // Call to the parent class method
     System.out.println("Secondary Subject: " + subject);
 }
}
public class SuperClassConstructor {

	public static void main(String[] args) {
		Secondary secondaryStudent = new Secondary("Anisha", "Mathematics");
        secondaryStudent.display();  // Display the information of the secondary student
	}

}
