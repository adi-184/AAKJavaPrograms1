
public class CubedNumbers {
	public static void main(String[] args) {
		System.out.println("Numbers between 1 and 100 whose cubes are between 1 and 100:");

        for (int i = 1; i <= 100; i++) {
            int cube = i * i * i;  // Calculate the cube of the number

            // Check if the cube is within the range 1 to 100
            if (cube <= 100) {
                System.out.println("Cube of " + i + " is: " + cube);
            } else {
                break;  // Exit the loop if the cube exceeds 100
            }
        }

	}

}
