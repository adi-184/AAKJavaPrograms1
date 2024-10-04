package inheritanceandinterface;
//Interface definition
interface CreditCardInterface {
 void viewCreditAmount();
 void useCard(double amount);
 void payCredit(double amount);
 void increaseLimit();
}

//SilverCardCustomer class
class SilverCardCustomer implements CreditCardInterface {
 String name;
 String cardNumber;
 double creditAmount = 0;
 double creditLimit = 50000;

 public SilverCardCustomer(String name, String cardNumber) {
     this.name = name;
     this.cardNumber = cardNumber;
 }

 @Override
 public void viewCreditAmount() {
     System.out.println("Current Credit Amount: " + creditAmount);
 }

 @Override
 public void useCard(double amount) {
     if (creditAmount + amount <= creditLimit) {
         creditAmount += amount;
         System.out.println("Used card for: " + amount);
     } else {
         System.out.println("Transaction failed! Exceeds credit limit.");
     }
 }

 @Override
 public void payCredit(double amount) {
     if (creditAmount - amount >= 0) {
         creditAmount -= amount;
         System.out.println("Paid credit of: " + amount);
     } else {
         System.out.println("Payment failed! Cannot reduce below zero.");
     }
 }

 @Override
 public void increaseLimit() {
     System.out.println("Increase limit is not applicable for Silver Card.");
 }
}

//GoldCardCustomer class inheriting from SilverCardCustomer
class GoldCardCustomer extends SilverCardCustomer {
 private int increaseLimitCount = 0;

 public GoldCardCustomer(String name, String cardNumber) {
     super(name, cardNumber);
     this.creditLimit = 100000; // Set credit limit for Gold Card
 }

 @Override
 public void increaseLimit() {
     if (increaseLimitCount < 3) {
         creditLimit += 5000;
         increaseLimitCount++;
         System.out.println("Credit limit increased by 5000. New limit: " + creditLimit);
     } else {
         System.out.println("Limit increase exceeded. Cannot increase more than 3 times.");
     }
 }
}

//Main class to test the implementation
public class CreditCard {

	public static void main(String[] args) {
		SilverCardCustomer silverCustomer = new SilverCardCustomer("John Doe", "1234567812345678");
        GoldCardCustomer goldCustomer = new GoldCardCustomer("Jane Smith", "8765432187654321");

        // Test Silver Card Operations
        silverCustomer.viewCreditAmount();
        silverCustomer.useCard(20000);
        silverCustomer.viewCreditAmount();
        silverCustomer.payCredit(5000);
        silverCustomer.viewCreditAmount();
        silverCustomer.useCard(40000); // Should fail due to limit

        // Test Gold Card Operations
        goldCustomer.viewCreditAmount();
        goldCustomer.useCard(30000);
        goldCustomer.viewCreditAmount();
        goldCustomer.payCredit(10000);
        goldCustomer.viewCreditAmount();
        goldCustomer.increaseLimit(); // Increase limit
        goldCustomer.increaseLimit(); // Increase limit
        goldCustomer.increaseLimit(); // Increase limit
        goldCustomer.increaseLimit(); // Should fail due to limit increase limit

        // Final state
        goldCustomer.viewCreditAmount();

	}

}
