//Task-2
public class LogicalOperatorPermutations {
    public static void main(String[] args) {
        boolean[] values = { true, false };

        System.out.println("Permutations of && (logical AND) operator:");
        for (boolean a : values) {
            for (boolean b : values) {
                boolean result = a && b;
                System.out.println(a + " && " + b + " = " + result);
            }
        }

        System.out.println("\nPermutations of || (logical OR) operator:");
        for (boolean a : values) {
            for (boolean b : values) {
                boolean result = a || b;
                System.out.println(a + " || " + b + " = " + result);
            }
        }
    }
}
