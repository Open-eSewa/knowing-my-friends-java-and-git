package np.com.esewa.intern;

/**
 * 
 */
public class Main {
    int a=500;  //instance variable
    static int b=200 ; //static variable

    void sum()
    {
        int c=900; //local variable
    }
  void mul()
    {
        int d=700; //local variable
        //int x=c+d; error because we can't use local
       
        int y=a+d;
        System.out.println(y);
    }
  
    public static void main(String[] args) {
        Main ob= new Main();
        ob.mul();
       System.out.println(b);
    }
}