package np.com.esewa.intern;

/**
 * Relational Operator in java: (>,< , >==, <== , == ,!==).
 */
public class RelationalOperator {

    /**
     * Compares two values for equality.
     *
     * @param a First operand
     * @param b Second operand
     * @return true if a is equal to b, false otherwise
     */
    public boolean isEqual(int a, int b) {
        return a == b;
    }

    /**
     * Checks if the first value is not equal to the second value.
     *
     * @param a First operand
     * @param b Second operand
     * @return true if a is not equal to b, false otherwise
     */
    public boolean isNotEqual(int a, int b) {
        return a != b;
    }

    /**
     * Checks if the first value is greater than the second value.
     *
     * @param a First operand
     * @param b Second operand
     * @return true if a is greater than b, false otherwise
     */
    public boolean isGreaterThan(int a, int b) {
        return a > b;
    }

    /**
     * Checks if the first value is less than the second value.
     *
     * @param a First operand
     * @param b Second operand
     * @return true if a is less than b, false otherwise
     */
    public boolean isLessThan(int a, int b) {
        return a < b;
    }

    /**
     * Checks if the first value is greater than or equal to the second value.
     *
     * @param a First operand
     * @param b Second operand
     * @return true if a is greater than or equal to b, false otherwise
     */
    public boolean isGreaterThanOrEqual(int a, int b) {
        return a >= b;
    }

    /**
     * Checks if the first value is less than or equal to the second value.
     *
     * @param a First operand
     * @param b Second operand
     * @return true if a is less than or equal to b, false otherwise
     */
    public boolean isLessThanOrEqual(int a, int b) {
        return a <= b;
    }

    public static void main(String[] args) {
      RelationalOperator relationalOperator = new RelationalOperator();
        System.out.println(relationalOperator.isEqual(5,6));
        System.out.println(relationalOperator.isGreaterThan(5,6));
        System.out.println(relationalOperator.isLessThan(7,5));
        System.out.println(relationalOperator.isLessThanOrEqual(6,8));
        System.out.println(relationalOperator.isGreaterThanOrEqual(8,22));
        System.out.println(relationalOperator.isNotEqual(7,9));
    }
}