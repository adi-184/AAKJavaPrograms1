package inheritanceandinterface;

public class FinalVariable {

	public static void main(String[] args) {
		final int finalVariable = 10; // Declaring a final variable

        System.out.println("The value of finalVariable: " + finalVariable);

        // Attempting to change the final variable will result in a compile-time error
        // finalVariable = 20; // Uncommenting this line will cause an error

        // Final variables can be used in expressions
        final int multiplier = 2;
        int result = finalVariable * multiplier;

        System.out.println("Result after multiplying with multiplier: " + result);

        // Final reference variable
        final User user = new User("Alice");
        System.out.println("User's name: " + user.getName());

        // You can change the object's state, but you cannot change the reference
        user.setName("Bob");
        System.out.println("Updated user's name: " + user.getName());

        // Uncommenting the line below will cause a compile-time error
        // user = new User("Charlie"); // This would cause an error
    }
}

// A simple class to demonstrate final reference variable
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}