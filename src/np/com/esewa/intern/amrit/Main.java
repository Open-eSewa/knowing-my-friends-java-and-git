package np.com.esewa.intern.amrit;

/**
 * This class demonstrates expressions and precedence rules in Java.
 * It showcases various types of expressions and their evaluation.
 * An expression in programming is a combination of operators and operands.
 * Precedence determines the part of expression that executes first.
 */
public class Main {

    public static void Expressionrule (){
        // Arithmetic Expression
        int a = 3+5*8; // This is a simple arithmetic expression in java
        int b = (5-3)*8; // Parentheses enforced expression

        System.out.println("Arithmetic expression 1: " + a);
        System.out.println("Arithmetic expression 2: " + b);

        // Boolean expressions
        boolean bool1 = (5<3) && (3!=1); // && operator returns true if both the operands are true
        boolean bool2 = (5<=3) || ( 8 == 8); // || operator returns true if only one of operands is true

        System.out.println("Boolean expression 1: " + bool1);
        System.out.println("Boolean expression 2: " + bool2);

        //Assignment Expressions
        float x = 10;
        x += 4; // Adds 4 to x
        float y = 5;
        y -=3; // Subtracts 3 from y
        x*=3; // Multiplies x by 3

        System.out.println("Assignment 1: "+x);
        System.out.println("Assignment 2: "+y);

    }

    public static void main(String[] args){
        System.out.println("Expression Rule: ");
        Expressionrule();
    }
}
