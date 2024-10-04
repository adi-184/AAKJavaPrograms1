package inheritanceandinterface;
// First interface
interface StaffInfo {
    void setStaffDetails(String name, int id);
    String getStaffDetails();
}

// Second interface
interface Department {
    void setDepartment(String department);
    String getDepartment();
}

// Class implementing both interfaces
class StaffMember implements StaffInfo, Department {
    private String name;
    private int id;
    private String department;

    @Override
    public void setStaffDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getStaffDetails() {
        return "Staff Name: " + name + ", ID: " + id;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartment() {
        return department;
    }
}


public class MultipleInheritance {

	public static void main(String[] args) {
		StaffMember staffMember = new StaffMember();

        // Setting staff details
        staffMember.setStaffDetails("Anisha", 4222);
        staffMember.setDepartment("Web Development");

        // Displaying staff information
        System.out.println(staffMember.getStaffDetails());
        System.out.println("Department: " + staffMember.getDepartment());
	}

}
