package chapterno1;
//Class representing a Student
class Student {
 // Instance variables
 private String name;
 private int age;

 // Constructor to initialize instance variables
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display student details
 public void displayDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
 }
}
//Main class
public class Constructor {

	public static void main(String[] args) {
		// Create an instance of the Student class
        Student student1 = new Student("Anisha", 20);

        // Display the details of the student
        student1.displayDetails();

	}

}
