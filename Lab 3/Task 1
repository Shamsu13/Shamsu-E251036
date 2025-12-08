importjava.util.Scanner;
public class EvenNumbersArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, i, count = 0;
        System.out.print("Enter starting number: ");
        start = input.nextInt();
        System.out.print("Enter ending number: ");
        end = input.nextInt();
        int[] evenNumbers = new int[end - start + 1];
        i = start;
        System.out.println("\nEven numbers using WHILE loop:");
        while (i <= end) {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                System.out.print(evenNumbers[count] + " ");
                count++;
            }
            i++;
        }
        i = start;
        count = 0;
        System.out.println("\n\nEven numbers using DO-WHILE loop:");
        do {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                System.out.print(evenNumbers[count] + " ");
                count++;
            }
            i++;
        } while (i <= end);
        input.close();
    }
}
