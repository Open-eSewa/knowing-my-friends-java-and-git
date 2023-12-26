package np.com.esewa.intern.primitivedatatypes.floatexample;

public class ExampleFloat {

    /**
     *the type float specifies a single-precision value that uses 32 bits of storage.
     *
     */

   public static void floatExample(){
       float myFloat = 123.45f; // Note the 'f' suffix indicating a float literal
       // Printing the value of the float variable
       System.out.println("Value of myFloat: " + myFloat);

       // Type conversion: float to other types
       int intFromFloat = (int) myFloat;
       long longFromFloat = (long) myFloat;


       System.out.println("Converted to int: " + intFromFloat);
       System.out.println("Converted to long: " + longFromFloat);
   }

    public static void main(String[] args) {
        floatExample();
    }
}
