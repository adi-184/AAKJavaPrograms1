package inheritanceandinterface;
//Interface for employee information
interface EmpInfo {
 void setEmployeeDetails(String name, int id);
 String getEmployeeDetails();
}

//Extended interface for displaying employee information
interface EmpShow extends EmpInfo {
 void displayEmployeeInfo();
}

//Class implementing the EmpShow interface
class Employee implements EmpShow {
 private String name;
 private int id;

 @Override
 public void setEmployeeDetails(String name, int id) {
     this.name = name;
     this.id = id;
 }

 @Override
 public String getEmployeeDetails() {
     return "Employee Name: " + name + ", ID: " + id;
 }

 @Override
 public void displayEmployeeInfo() {
     System.out.println(getEmployeeDetails());
 }
}
public class ExtendingInterfaces {

	public static void main(String[] args) {
		Employee employee = new Employee();

        // Setting employee details
        employee.setEmployeeDetails("Anisha", 4222);
        
        // Displaying employee information
        employee.displayEmployeeInfo();

	}

}
