//Task-8


import java.util.Scanner;

public class DifferenceBetweenGreatestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();

        // Initialize variables to store the greatest and smallest numbers
        int greatest = num1;
        int smallest = num1;

        // Compare num2, num3, and num4 with the current greatest and smallest
        if (num2 > greatest) {
            greatest = num2;
        } else if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        } else if (num3 < smallest) {
            smallest = num3;
        }

        if (num4 > greatest) {
            greatest = num4;
        } else if (num4 < smallest) {
            smallest = num4;
        }

        // Calculate the difference between the greatest and smallest numbers
        int difference = greatest - smallest;

        System.out.println("The difference between the greatest and smallest numbers is: " + difference);

        scanner.close();
    }
}
