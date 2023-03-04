import java.util.Random;
import java.util.Scanner;
/**
* This program calculates amount of Energy released when mass is converted to
* energy.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/

public final class BoardFoot {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Creating the random generator
        final Random rand = new Random();

        // Creating the scanner.
        final Scanner scanner = new Scanner(System.in);

        // Getting user input for height and width
        System.out.print("Enter the height: ");
        final String heightStr = scanner.nextLine();
        System.out.print("Enter the width: ");
        final String widthStr = scanner.nextLine();

        // try catching any input errors
        try {
            // Parsing to doubles
            final double heightDbl = Double.parseDouble(heightStr);
            final double widthDbl = Double.parseDouble(widthStr);
            // Negative input is not allowed
            if (widthDbl > 0 && heightDbl > 0) {
                // Calling the function that will calculate the length
                final double lengthDbl = calcBdFt(heightDbl, widthDbl);
                System.out.format("The length is %.2fin\n", lengthDbl);
            } else {
                System.out.println("The input cannot be negative!");
            }
        } catch (NumberFormatException error) {
            System.out.println("That input is invalid");
        }
        scanner.close();
    }
    /**
    * This function calculates the length given the width and height.
    *
    * @author  Alex De Meo
    * @version 1.0
    * @param width Necessary for the length calculations
    * @param height Necessary for Calculating length
    * @return The length that was calculated
    * @since   2023/02/08
    */

    public static double calcBdFt(double height, double width) {
        // This is the Board foot volume constant
        final double bDfT = 144.0;

        // Calculating the length
        final double length = bDfT / (height * width);
        // Returning the length back to where it was called from
        return length;
    }
}
