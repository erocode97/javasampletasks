//Task-1
public class LiteralExamples {
    public static void main(String[] args) {
        // Every literal of the boolean type
        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println("Boolean literals:");
        System.out.println("true: " + boolTrue);
        System.out.println("false: " + boolFalse);

        // The number 4 represented in four different ways
        int decimalFour = 4;
        int hexadecimalFour = 0x4; // Hexadecimal
        int octalFour = 04; // Octal
        int binaryFour = 0b100; // Binary

        System.out.println("\nInteger literals representing the number 4:");
        System.out.println("Decimal: " + decimalFour);
        System.out.println("Hexadecimal: " + hexadecimalFour);
        System.out.println("Octal: " + octalFour);
        System.out.println("Binary: " + binaryFour);

        // A real number literal
        double realNumber = 3.14;

        System.out.println("\nReal number literal:");
        System.out.println("3.14: " + realNumber);
    }
}
