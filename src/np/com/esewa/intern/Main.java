package np.com.esewa.intern;

public class Main {
    public static void main(String[] args) {
        // Logical AND (&&) Operator
        boolean cond1 = true;
        boolean cond2 = false;

        // Perform logical AND operation on cond1 and cond2
        boolean resultAND = cond1 && cond2;

        // Print the result of the logical AND operation
        System.out.println("Logical AND: " + resultAND);

        // Logical OR (||) Operator
        // Perform logical OR operation on cond1 and cond2
        boolean resultOR = cond1 || cond2;

        // Print the result of the logical OR operation
        System.out.println("Logical OR: " + resultOR);

        // Logical NOT (!) Operator
        // Perform logical NOT operation on cond1
        boolean resultNOT = !cond1;

        // Print the result of the logical NOT operation
        System.out.println("Logical NOT: " + resultNOT);

        // Combining logical operators
        // Create a complex condition using logical AND, logical OR, and logical NOT
        boolean complexcond = (cond1 && cond2) || (cond1 && !cond2);

        // Print the result of the complex condition
        System.out.println("Complex cond: " + complexcond);
    }
}
