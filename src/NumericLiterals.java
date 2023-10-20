//Task-3
public class NumericLiterals {
    public static void main(String[] args) {
        // Without underscores
        int number1 = 1000000;

        // With underscores for readability
        int number2 = 1_000_000;

        // Print both numbers
        System.out.println("Number 1 (without underscores): " + number1);
        System.out.println("Number 2 (with underscores): " + number2);

        // Check if the numbers are equal
        boolean areEqual = (number1 == number2);
        System.out.println("Are the numbers equal? " + areEqual);
    }
}
