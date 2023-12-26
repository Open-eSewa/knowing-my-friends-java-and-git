public class Decelaration {
    public static void main(String[] args) {
        /**
         * It is all primitive datatype
         */
        int a=10;
        float b= 10.5F;
        double c=10.524;
        boolean d=true;
        short e=4;
        char f='c';
        long g=432234234;
        byte h=0101;

        /**
         * Non primitive datatype can be define directly or by making Object
         */
        String name="Esewa";
        String data=new String("F1soft");

        /**
         * Array is collection of similar datatype. It can be initialized by assigning value
         */
        int[] arr={1,4,2,6,7,32,3};

        /**
         * Array can also be initialized by defining the size in [] bracket
         */
        char[] arra=new char[5];
        arra[1]='a';
        arra[2]='r';

        String s=null;
        switch (s){
            case null -> {
                System.out.println("Nothing here");
            }
            default -> {
                System.out.println("I am defalut");
            }
        }

    }
}
