package np.com.esewa.intern;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Document the usage of each bitwise operator using Java documentation comments
 * Implement a Java class showcasing bitwise operators (&, |, ^, ~, <<, >>, >>>).
 * <p>
 * There are various bitwise operators such as:
 * 1. AND(&)
 *
 * @see #bitwiseAND(int, int)
 * <p>
 * 2. OR(|)
 * @see #bitwiseOR(int, int)
 * <p>
 * 3. XOR (^)
 * * @see #bitwiseXOR(int, int)
 * <p>
 * 4. Complement (~)
 * @see #bitwiseComplement(int)
 * <p>
 * <p>
 * 5. Right Shift(>>)
 * @see #bitwiseRightShift(int)
 * <p>
 * <p>
 * 6. Left Shift(<<)
 * @see #bitwiseLeftShift(int)
 * <p>
 * <p>
 * <p>
 * 7. Unsigned Right Shift(>>>)
 * @see #bitwiseUnsignedRightShift(int)
 */


public class BitwiseOperatorTask {

    /**
     * @param firstNumber
     * @param secondNumber
     * @see #bitwiseAND(int, int)
     */


    public static void bitwiseAND(int firstNumber, int secondNumber) {
        System.out.print("Bitwise AND Operator: ");
        System.out.println(firstNumber & secondNumber);
    }


    public static void bitwiseOR(int firstNumber, int secondNumber) {
        System.out.print("Bitwise OR Operator: ");
        System.out.println(firstNumber | secondNumber);
    }

    public static void bitwiseXOR(int firstNumber, int secondNumber) {
        System.out.print("Bitwise XOR Operator: ");
        System.out.println(firstNumber ^ secondNumber);
    }


    public static void bitwiseComplement(int givenNumber) {
        System.out.println("Bitwise Complement Operator");
        System.out.println("Complement of a: " + ~givenNumber);
    }

    public static void bitwiseLeftShift(int givenNumber) {
        System.out.println("Bitwise LeftShift Operator");
        System.out.print("LeftShift of a: ");
        System.out.println(givenNumber << 2);
    }

    public static void bitwiseRightShift(int givenNumber) {
        System.out.println("Bitwise RightShift Operator");
        System.out.print("RightShift of a: ");
        System.out.println(givenNumber >> 2);
    }


    public static void bitwiseUnsignedRightShift(int givenNumber) {
        System.out.println("Bitwise UnsignedRightShift Operator");
        System.out.print("UnsignedRightShift of a: ");
        System.out.println(givenNumber >>> 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int givenNumber = 0;
        int choice, firstNumber =0, secondNumber = 0;
        char yesNoChoice;

        do {

            System.out.println("\n**********Bitwise Operator**********");
            System.out.println("""
                    1. AND Operator
                    2. OR Operator
                    3. XOR Operator
                    4. Complement Operator
                    5. Signed Left Sift Operator
                    6. Signed Right Shift Operator
                    7. Unsigned Right Shift
                                        
                    """);

            System.out.print("Enter Your Choice:");
            choice = sc.nextInt();

            if (choice > 0 && choice <= 3) {
                System.out.print("Enter First No.: ");
                firstNumber = sc.nextInt();

                System.out.print("Enter Second No.: ");
                secondNumber = sc.nextInt();

            } else {
                System.out.print("Enter a Number: ");
                givenNumber = sc.nextInt();
            }


            switch (choice) {
                case 1 -> bitwiseAND(firstNumber, secondNumber);
                case 2 -> bitwiseOR(firstNumber, secondNumber);
                case 3 -> bitwiseXOR(firstNumber, secondNumber);
                case 4 -> bitwiseComplement(givenNumber);
                case 5 -> bitwiseLeftShift(givenNumber);
                case 6 -> bitwiseRightShift(givenNumber);
                case 7 -> bitwiseUnsignedRightShift(givenNumber);
                default -> out.println("Check Your Choice!!!");
            }

            System.out.print("Do you want to do More Bitwise Operation again? (y/n): ");
            yesNoChoice = sc.next().charAt(0);

        }
        while (yesNoChoice == 'y' || yesNoChoice == 'Y');


    }
}
