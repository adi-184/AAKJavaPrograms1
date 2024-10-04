package inheritanceandinterface;
//Superclass: Employer
class Employer {
 protected String name;
 protected double salary;

 // Constructor to initialize name and salary
 public Employer(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // Method to display employer details
 public void displayEmployerDetails() {
     System.out.println("Employer Name: " + name);
     System.out.println("Salary: " + salary);
 }
}

//Subclass: Developer
class Developer extends Employer {
 protected String projectName;

 // Constructor to initialize name, salary, and project name
 public Developer(String name, double salary, String projectName) {
     super(name, salary); // Call the Employer constructor
     this.projectName = projectName;
 }

 // Method to display developer details
 public void displayDeveloperDetails() {
     displayEmployerDetails(); // Call the superclass method
     System.out.println("Project Name: " + projectName);
 }
}

//Subclass: Programmer
class Programmer extends Developer {
 private String progLanguage;

 // Constructor to initialize name, salary, project name, and programming language
 public Programmer(String name, double salary, String projectName, String progLanguage) {
     super(name, salary, projectName); // Call the Developer constructor
     this.progLanguage = progLanguage;
 }

 // Method to display programmer details
 public void displayProgrammerDetails() {
     displayDeveloperDetails(); // Call the superclass method
     System.out.println("Programming Language: " + progLanguage);
 }
}

//Main class to test the functionality
public class EmployeeDeveloper {

	public static void main(String[] args) {
		 // Create an object of Developer
        Developer developer = new Developer("Abantika", 75000, "E-Commerce Website");
        System.out.println("Developer Details:");
        developer.displayDeveloperDetails();
        
        // Create an object of Programmer
        Programmer programmer = new Programmer("Anisha", 80000, "Mobile App", "Python");
        System.out.println("\nProgrammer Details:");
        programmer.displayProgrammerDetails();

	}

}
