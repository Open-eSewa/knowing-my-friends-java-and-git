package np.com.esewa.intern.primitivedatatypes.intexample;

public class ExampleInt {

    /**
     * It is a signed 32-bit type that has a range
     * from –2,147,483,648 to 2,147,483,647.
     * The default value of int is 0 if not initialized
     * <p>
     * int myAge;
     * int rollNumber;
     */

    static void exampleOfInt() {
        int myAge = 24;
        int myRoll = 119;

        /**
         * the below is the example of type casting
         */


        int intValue = 42;
        byte byteValue = 5;

        int result = intValue + byteValue;
        System.out.println(result);// Implicit conversion (widening) from byte to int

        // Explicit conversion (narrowing) from int to byte
        byte byteValue2 = (byte) intValue;



        int intValue3 = 56;

        // Widening (implicit)
        long longValue = intValue3;    // int to long
        float floatValue = intValue3;  // int to float
        double doubleValue = intValue3;// int to double
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        // Narrowing (explicit)
        short shortValue = (short) intValue3;  // int to short
        byte byteValue3 = (byte) intValue3;    // int to byte
        System.out.println(shortValue);
        System.out.println(byteValue3);
    }

    public static void main(String[] args) {
        exampleOfInt();
    }
}
