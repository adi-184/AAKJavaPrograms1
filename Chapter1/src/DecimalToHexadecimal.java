package chapterno1;
import java.util.Scanner;
public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
	      System.out.println("Enter a decimal number: ");  
	      int decimalNumber = scanner.nextInt();  
	      scanner.close();  
	  
	      String hexadecimalNumber = String.format("%x", decimalNumber);  
	      System.out.println("The hexadecimal representation of " + decimalNumber + " is " + hexadecimalNumber);  
	}

}
