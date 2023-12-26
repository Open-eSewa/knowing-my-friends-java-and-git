package np.com.esewa.intern;

import java.util.Scanner;

import static java.lang.System.*;

public class BitwiseOperatorTask {


    public static void bitwiseAND(int a, int b) {
        System.out.print("Bitwise AND Operator: ");
        System.out.println(a & b);
    }

    public static void bitwiseOR(int a, int b) {
        System.out.print("Bitwise OR Operator: ");
        System.out.println(a | b);
    }

    public static void bitwiseXOR(int a, int b) {
        System.out.print("Bitwise XOR Operator: ");
        System.out.println(a ^ b);
    }



    public static void bitwiseNOT(int a) {
        System.out.println("Bitwise NOT Operator");
        System.out.println("NOT of a: " + ~a);
    }

    public static void bitwiseLeftShift(int a) {
        System.out.println("Bitwise LeftShift Operator");
        System.out.print("LeftShift of a: ");
        System.out.println(a << 2);
    }

    public static void bitwiseRightShift(int a) {
        System.out.println("Bitwise RightShift Operator");
        System.out.print("RightShift of a: ");
        System.out.println(a >> 2);
    }


    public static void bitwiseUnsignedRightShift(int a) {
        System.out.println("Bitwise UnsignedRightShift Operator");
        System.out.print("UnsignedRightShift of a: ");
        System.out.println(a >>> 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int choice, a, b = 0;
        char yesNoChoice;

        do {

            System.out.println("\n**********Bitwise Operator**********");
            System.out.println("""
                    1. AND Operator
                    2. OR Operator
                    3. XOR Operator
                    4. NOT Operator
                    5. Signed Left Sift Operator
                    6. Signed Right Shift Operator
                    7. Unsigned Right Shift
                                        
                    """);

            System.out.print("Enter Your Choice:");
            choice = sc.nextInt();

            if (choice > 0 && choice <= 3) {
                System.out.print("Enter First No.: ");
                a = sc.nextInt();

                System.out.print("Enter Second No.: ");
                b = sc.nextInt();

            } else {
                System.out.print("Enter a Number: ");
                a = sc.nextInt();
            }


            switch (choice) {
                case 1:
                    bitwiseAND(a, b);
                break;

                case 2:
                    bitwiseOR(a, b);
                break;
                case 3:
                    bitwiseXOR(a, b);
                break;
                case 4:
                    bitwiseNOT(a);
                break;
                case 5:
                    bitwiseLeftShift(a);
                break;
                case 6:
                    bitwiseRightShift(a);
                break;
                case 7:
                    bitwiseUnsignedRightShift(a);
                break;
                default:
                    out.println("Check Your Choice!!!");
                    break;

            }

            System.out.print("Do you want to do More Bitwise Operation again? (y/n): ");
            yesNoChoice = sc.next().charAt(0);

        }
        while (yesNoChoice == 'y' || yesNoChoice == 'Y');


    }
}
