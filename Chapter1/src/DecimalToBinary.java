package chapterno1;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a decimal number
	        System.out.print("Enter a decimal number: ");
	        int decimalNumber = scanner.nextInt();

	        // Convert decimal to binary
	        String binaryString = decimalToBinary(decimalNumber);

	        // Display the result
	        System.out.println("Binary equivalent: " + binaryString);

	        scanner.close(); // Close the scanner
	    }

	    // Method to convert decimal integer to binary string
	    public static String decimalToBinary(int decimal) {
	        StringBuilder binary = new StringBuilder();

	        // Handle the case for zero
	        if (decimal == 0) {
	            return "0";
	        }

	        // Convert decimal to binary
	        while (decimal > 0) {
	            int remainder = decimal % 2; // Get remainder
	            binary.insert(0, remainder); // Prepend the remainder
	            decimal /= 2; // Divide decimal by 2
	        }

	        return binary.toString(); // Return the binary string

	}

}
