import java.util.Scanner;

public class day5_4_Harmonic {
    public static void main(String[] args) {
        // Taking user input for the harmonic value N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (N should be non-zero): ");
        int N = scanner.nextInt();

        // Validate input
        if (N == 0) {
            System.out.println("N should be non-zero.");
            return;
        }

        // Compute the Nth harmonic number
        double harmonicNumber = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        // Print the result
        System.out.println("The " + N + "th Harmonic Value is: " + harmonicNumber);
    }
}
