package np.com.esewa.intern.primitivedatatypes;

public class DataTypesExample {


    //Boolean
    static void booleanExample() {
        boolean isJavaFun = true;
        System.out.println("Boolean Example: " + isJavaFun);

        if (!isJavaFun) {
            System.out.println("Yes java is fun");
        } else {
            System.out.println("Java is not fun at all");
        }
    }

    //Byte

    static void byteExample() {
        byte b = 127;
        System.out.println(b);
        byte c = -128;
        System.out.println(b);
        //byte d=128; //compiler will detect error type conversion suggested

        /**
         * the value of e is otside the range of byte
         * the underflow occurs
         * the answer is 127
         */

        byte e = (byte) -129;
        System.out.println(e);

        /**
         * the overflow occurs cause the value is beyound the byte range
         * the answer is -127
         */

        byte f = (byte) 129;
        System.out.println(f);


    }

    //Charcter

    /**
     * the data type used to store characters is char
     * in Java char is a 16-bit type
     */

    static void charExample() {
        char ch1, ch2;
        ch1 = 88; // code for X
        ch2 = 'Y';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }

    //Double
    static void doubleExample() {

        double myDouble = 1234.5678;

        // Type conversion: double to other types
        int intFromDouble = (int) myDouble; // Explicit casting from double to int
        long longFromDouble = (long) myDouble; // Explicit casting from double to long

        // Printing the results of type conversion
        System.out.println("Converted to int: " + intFromDouble);
        System.out.println("Converted to long: " + longFromDouble);


    }

    //FloatExample

    public static void floatExample() {
        float myFloat = 123.45f; // Note the 'f' suffix indicating a float literal
        // Printing the value of the float variable
        System.out.println("Value of myFloat: " + myFloat);

        // Type conversion: float to other types
        int intFromFloat = (int) myFloat;
        long longFromFloat = (long) myFloat;


        System.out.println("Converted to int: " + intFromFloat);
        System.out.println("Converted to long: " + longFromFloat);
    }


    //int

    /**
     * It is a signed 32-bit type that has a range
     * from –2,147,483,648 to 2,147,483,647.
     * The default value of int is 0 if not initialized
     * int myAge;
     * int rollNumber;
     */
    static void exampleOfInt() {
        /**
         * the below is the example of type casting
         */
        int intValue = 42;
        byte byteValue = 5;

        int result = intValue + byteValue;
        System.out.println(result);// Implicit conversion (widening) from byte to int

        // Explicit conversion (narrowing) from int to byte
        byte byteValue2 = (byte) intValue;
        System.out.println(byteValue2);

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

    //Long Example
    public static void longExample() {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000; // approximate speed of light in miles per second
        days = 1000; // specify number of days here
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightspeed * seconds; // compute distance
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
        /**
         * in 1000 days light will travel about 160704000000 miles
         * which is not possible when we have int
         */

    }

    //Short Example

    static void shortExample() {
        /**
         * the range of short value is -32768 to 32767
         */

        short normalValue = 1000;
        System.out.println("The normal value is " + normalValue);

        short negativeValue = -500;
        System.out.println("The short negative value is " + negativeValue);

        short maxValue = Short.MAX_VALUE;
        System.out.println("The maximum short value is " + maxValue);

        short minValue = Short.MIN_VALUE;
        System.out.println("The minimum short value is " + minValue);


        short shortValue = 100;
        int intValue = shortValue; // Widening (implicit) casting
        System.out.println(shortValue);

        int intValueOne = 40000;
        short shortValueOne = (short) intValueOne; // Narrowing (explicit) casting with potential loss
        System.out.println(shortValueOne); // Output: -21536

    }

    public static void main(String[] args) {
        booleanExample();
        exampleOfInt();
        booleanExample();
        shortExample();
        floatExample();
        doubleExample();
        charExample();
        booleanExample();
    }
}
