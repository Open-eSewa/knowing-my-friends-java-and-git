package np.com.esewa.intern.primitivedatatypes.doubleexample;

public class ExampleDouble {
    /**
     * by the double keyword, uses 64 bits to store a value
     * Double precision is actually faster than single precision
     * transcendental math functions,such as sin( ), cos( ), and sqrt( ), return double values
     */

    static void doubleExample(){

        double myDouble = 1234.5678;

        // Type conversion: double to other types
        int intFromDouble = (int) myDouble; // Explicit casting from double to int
        long longFromDouble = (long) myDouble; // Explicit casting from double to long

        // Printing the results of type conversion
        System.out.println("Converted to int: " + intFromDouble);
        System.out.println("Converted to long: " + longFromDouble);


    }
}
