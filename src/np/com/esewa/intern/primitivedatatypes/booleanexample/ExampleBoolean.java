package np.com.esewa.intern.primitivedatatypes.booleanexample;

public class ExampleBoolean {
    /**
     * Java has a primitive type, called boolean, for logical values
     * It can have only one of two possible values, true or false
     */

    static void booleanExample(){
        boolean isJavaFun = true;
        System.out.println("Boolean Example: " + isJavaFun);

        if(!isJavaFun){
            System.out.println("Yes java is fun");
        }else {
            System.out.println("Java is not fun at all");
        }
    }

    public static void main(String[] args) {
        booleanExample();
    }
}
