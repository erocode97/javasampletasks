//Task-7
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();

        // Sort the numbers in ascending order using conditional statements
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // Print the numbers in ascending order
        System.out.println(a + " " + b + " " + c);

        scanner.close();
    }
}
