import java.util.Scanner;

public class day5_6_Remainder{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if divisor is not zero
        if (divisor != 0) {
            // Compute quotient and remainder
			
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            // Print results
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }
    }
}
