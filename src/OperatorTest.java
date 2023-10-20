//Task-4
public class OperatorTest {
    public static void main(String[] args) {
        // Testing with integers
        int num1 = 10;
        int num2 = 3;

        System.out.println("Integers:");
        System.out.println("num1 + num2 = " + (num1 + num2)); // Addition
        System.out.println("num1 - num2 = " + (num1 - num2)); // Subtraction
        System.out.println("num1 * num2 = " + (num1 * num2)); // Multiplication
        System.out.println("num1 / num2 = " + (num1 / num2)); // Division
        System.out.println("num1 % num2 = " + (num1 % num2)); // Modulus

        // Testing with real numbers (doubles)
        double realNum1 = 10.5;
        double realNum2 = 2.5;

        System.out.println("\nReal Numbers:");
        System.out.println("realNum1 + realNum2 = " + (realNum1 + realNum2)); // Addition
        System.out.println("realNum1 - realNum2 = " + (realNum1 - realNum2)); // Subtraction
        System.out.println("realNum1 * realNum2 = " + (realNum1 * realNum2)); // Multiplication
        System.out.println("realNum1 / realNum2 = " + (realNum1 / realNum2)); // Division

        // Testing with character types (char)
        char char1 = 'A';
        char char2 = 'B';

        System.out.println("\nCharacter Types:");
        // Characters can be added to get their ASCII values
        System.out.println("char1 + char2 = " + (char1 + char2));
        // Characters can also be subtracted to get the difference in their ASCII values
        System.out.println("char1 - char2 = " + (char1 - char2));
        // Multiplication and division are not defined for characters
    }
}
