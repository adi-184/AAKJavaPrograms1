package chapterno1;
import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to octal
        String octalString = decimalToOctal(decimalNumber);

        // Display the result
        System.out.println("Octal equivalent: " + octalString);

        scanner.close(); // Close the scanner
    }

    // Method to convert decimal integer to octal string
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        // Handle the case for zero
        if (decimal == 0) {
            return "0";
        }

        // Convert decimal to octal
        while (decimal > 0) {
            int remainder = decimal % 8; // Get remainder
            octal.insert(0, remainder); // Prepend the remainder
            decimal /= 8; // Divide decimal by 8
        }

        return octal.toString(); // Return the octal string

	}

}
