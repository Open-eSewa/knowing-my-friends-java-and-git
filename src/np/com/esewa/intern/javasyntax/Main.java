package np.com.esewa.intern.javasyntax;
import java.util.Scanner;
 /**
     *
     * @param msg
     */

class Message{
   
    public Message(String msg){
        System.out.println(msg);
    }
}
public class Main

{


    static void mymethod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your name:");
        String Userinput = sc.nextLine();
        System.out.println("Dear,"+ Userinput + "good morning");
    }
    public static void main(String[] args) {
        mymethod();
        Message n = new Message("this is me printing hello world");

    }
}
