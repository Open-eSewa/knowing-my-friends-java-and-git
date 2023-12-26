package np.com.esewa.intern;

public class WrapperClass {
    /**
     *
     * @return
     */
    public int wrapperInt() {
        Integer n1 = new Integer(15);
        Integer n2 = Integer.valueOf("16");     //autoboxing
        int sum = n1.intValue() + n2.intValue();
//                int sum = n1+n2;      auto-unboxing
        return sum;
//                System.out.println("Sum is :"+ sum);
    }

    public void wrapperChar(){
        Character c1 = new Character('c');
        char uC = Character.toUpperCase(c1.charValue());
        System.out.println("Uppercase character: "+uC);
    }

    public void wrapperBool(){
        Boolean b1 = new Boolean(true);
        Boolean b2 = Boolean.valueOf("false");
        boolean result = b1 || b2;
        System.out.println("result of boolean or: "+ result);
    }

    public static void main(String[] args) {
        WrapperClass main = new WrapperClass();
        System.out.println("Wrapper int is: "+main.wrapperInt());
        main.wrapperChar();
        main.wrapperBool();
        WrapperDouble wd = new WrapperDouble(4.56);

    }

}
