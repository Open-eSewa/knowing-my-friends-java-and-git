package np.com.esewa.intern;

/**
 * @author SatyaRajAwasth1  on 12/25/2023
 */
public class Main {
    public static void main(String[] args) {
                // Logical AND (&&) Operator
                boolean cond1 = true;
                boolean cond2 = false;
                boolean resultAND = cond1 && cond2;
                System.out.println("Logical AND: " + resultAND);
        
                // Logical OR (||) Operator
                boolean resultOR = cond1 || cond2;
                System.out.println("Logical OR: " + resultOR);
        
                // Logical NOT (!) Operator
                boolean resultNOT = !cond1;
                System.out.println("Logical NOT: " + resultNOT);
        
                // Combining logical operators
                boolean complexcond = (cond1 && cond2) || (cond1 && !cond2);
                System.out.println("Complex cond: " + complexcond);
    }
}