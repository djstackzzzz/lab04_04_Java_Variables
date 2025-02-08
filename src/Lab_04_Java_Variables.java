public class Main {
    public static void main(String[] args) {
        // Integer variable declarations
        int intOperandA = 15;
        int intOperandB = 5;
        int intSum, intProduct, intDifference, intQuotient, intModulo;

        // Integer arithmetic operations
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        // Printing integer results
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The remainder using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        // Double variable declarations
        double doubleOperandA = 13.75;
        double doubleOperandB = 4.50;
        double doubleSum, doubleProduct, doubleDifference, doubleQuotient;

        // Double arithmetic operations
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        // Printing double results
        System.out.println("\nThe sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);
    }
}
