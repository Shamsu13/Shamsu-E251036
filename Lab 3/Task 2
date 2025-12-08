import java.util.Scanner;

public class PrimeArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = input.nextInt();
        System.out.print("Enter ending number: ");
        int end = input.nextInt();
        int[] primes = new int[end - start + 1];
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
        }
        System.out.println("\nPrime numbers between " + start + " and "
                + end + " are:");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }
        input.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
