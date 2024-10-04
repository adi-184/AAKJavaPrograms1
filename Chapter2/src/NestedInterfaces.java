package inheritanceandinterface;
//Outer class
class School {
 // Nested interface inside the outer class
 interface Student {
     void studentInfo(String name, int rollNo);
 }
}

//Class implementing the nested interface
class Person implements School.Student {
 @Override
 public void studentInfo(String name, int rollNo) {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNo);
 }
}

public class NestedInterfaces {

	public static void main(String[] args) {
		// Create an instance of the class that implements the nested interface
        School.Student student = new Person();
        
        // Calling the method of the nested interface
        student.studentInfo("Anisha", 4222);

	}

}
