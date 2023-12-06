import java.util.Scanner;

public class day5_5_Factor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number to find the prime factors
        System.out.print("Enter the number to find prime factors: ");
        int numberToFactorize = scanner.nextInt();

        // Compute prime factorization using brute force
        System.out.print("Prime factors of " + numberToFactorize + ": ");
        primeFactorization(numberToFactorize);

        scanner.close();
    }

    
    static void primeFactorization(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is still greater than 1, it is a prime factor
        if (n > 1) {
            System.out.print(n);
        }
    }
}
