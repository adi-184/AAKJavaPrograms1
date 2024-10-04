package inheritanceandinterface;
//Base class
class BankAccount {
 protected double balance;

 // Constructor to initialize the balance
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Method to check the current balance
 public double getBalance() {
     return balance;
 }
}

//Subclass that overrides the withdraw method
class SavingsAccount extends BankAccount {

 // Constructor for SavingsAccount
 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 // Overriding the withdraw method to prevent withdrawals below a balance of 100
 @Override
 public void withdraw(double amount) {
     if (balance - amount >= 100) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal denied. Minimum balance of 100 must be maintained.");
     }
 }
}

//Main class to test the functionality
public class BankAccountTest {

	public static void main(String[] args) {
		// Create a SavingsAccount object with an initial balance of 500
        SavingsAccount savings = new SavingsAccount(500);

        // Display initial balance
        System.out.println("Initial Balance: " + savings.getBalance());

        // Try to withdraw 450 (should be denied because balance would fall below 100)
        savings.withdraw(450); // Output: Withdrawal denied. Minimum balance of 100 must be maintained.

        // Try to withdraw 350 (should succeed)
        savings.withdraw(350); // Output: Withdrawn: 350

        // Display balance after withdrawals
        System.out.println("Balance after withdrawals: " + savings.getBalance());

        // Deposit some amount
        savings.deposit(200); // Output: Deposited: 200

        // Display balance after deposit
        System.out.println("Balance after deposit: " + savings.getBalance());

	}

}
