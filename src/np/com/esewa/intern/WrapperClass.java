package np.com.esewa.intern;

public class WrapperClass {

    public int wrapperInt() {
        Integer n1 = new Integer(15);
        int intNum = 16;
        Integer n2 = intNum; //autoboxing -> automatic Conversion of primitive type to its corresponding wrapper class object
        int sum = n1.intValue() + n2.intValue();
//                int sum = n1+n2;     //auto-unboxing -> automatic conversion of a wrapper class object to its corresponding primitive data type
        return sum;
    }

    public void wrapperChar() {
        Character c1 = new Character('c');
        char uC = Character.toUpperCase(c1.charValue());
        System.out.println("Uppercase character: " + uC);
    }

    public void wrapperBool() {
        Boolean b1 = new Boolean(true);
        Boolean b2 = Boolean.valueOf("false");
        boolean result = b1 || b2;
        System.out.println("result of boolean or: " + result);
    }

    public static void main(String[] args) {
        WrapperClass wrapperClass = new WrapperClass();
        System.out.println("Wrapper int is: " + wrapperClass.wrapperInt());
        wrapperClass.wrapperChar();
        wrapperClass.wrapperBool();
        WrapperDouble wrapperDouble = new WrapperDouble(4.56);

    }

}
