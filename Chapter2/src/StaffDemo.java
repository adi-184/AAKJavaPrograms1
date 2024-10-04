package inheritanceandinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class Staff
abstract class Staff {
    String name;
    String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

// FullTimeStaff class
class FullTimeStaff extends Staff {
    String department;
    double salary;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        double hra = 0.08 * salary; // 8% of salary
        double da = 0.05 * salary; // 5% of salary
        return salary + hra + da;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
    }
}

// PartTimeStaff class
class PartTimeStaff extends Staff {
    int numberOfHours;
    double ratePerHour;

    public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return numberOfHours * ratePerHour;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Main class to test the implementation
public class StaffDemo {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        List<Staff> staffList = new ArrayList<>();

	        System.out.print("Enter number of staff members: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter type of staff (1 for FullTime, 2 for PartTime): ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            System.out.print("Enter name: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter address: ");
	            String address = scanner.nextLine();

	            if (choice == 1) { // FullTimeStaff
	                System.out.print("Enter department: ");
	                String department = scanner.nextLine();
	                System.out.print("Enter salary: ");
	                double salary = scanner.nextDouble();
	                staffList.add(new FullTimeStaff(name, address, department, salary));
	            } else if (choice == 2) { // PartTimeStaff
	                System.out.print("Enter number of hours: ");
	                int numberOfHours = scanner.nextInt();
	                System.out.print("Enter rate per hour: ");
	                double ratePerHour = scanner.nextDouble();
	                staffList.add(new PartTimeStaff(name, address, numberOfHours, ratePerHour));
	            }
	        }

	        // Display details of all staff
	        System.out.println("\nDetails of FullTime Staff:");
	        for (Staff staff : staffList) {
	            if (staff instanceof FullTimeStaff) {
	                staff.displayDetails();
	                System.out.println();
	            }
	        }

	        System.out.println("Details of PartTime Staff:");
	        for (Staff staff : staffList) {
	            if (staff instanceof PartTimeStaff) {
	                staff.displayDetails();
	                System.out.println();
	            }
	        }

	        scanner.close();

	}

}
