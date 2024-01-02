package np.com.esewa.intern.primitivedatatypes.byteexample;

public class ExampleByte {


    /**
     * smallest integer type is byte
     * range -128 to 127
     */

    static void byteExample(){
        byte b = 127;
        System.out.println(b);
        byte c= -128;
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

        byte f =(byte) 129;
        System.out.println(f);



    }


    public static void main(String[] args) {
        byteExample();

    }
}
