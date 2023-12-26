package np.com.esewa.intern.primitivedatatypes.shortexample;

public class Example {

    static void shortExample(){
        /**
         * the range of short value is -32768 to 32767
         */

        short normalValue = 1000;
        System.out.println("The normal value is "+normalValue);

        short negativeValue = -500;
        System.out.println("The short negative value is "+ negativeValue);

        short maxValue = Short.MAX_VALUE;
        System.out.println("The maximum short value is "+ maxValue);

        short minValue = Short.MIN_VALUE;
        System.out.println("The minimum short value is "+minValue);


        short shortValue = 100;
        int intValue = shortValue; // Widening (implicit) casting
        System.out.println(shortValue);

        int intValueOne= 40000;
        short shortValueOne = (short) intValueOne; // Narrowing (explicit) casting with potential loss
        System.out.println(shortValueOne); // Output: -21536

    }

    public static void main(String[] args) {
        shortExample();
    }
}
