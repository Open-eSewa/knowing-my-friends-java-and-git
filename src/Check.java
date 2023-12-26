import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Check {

    static String Calculator(String str1)throws NotFound{

        String str=str1;
        int index=0;
        for (char data : str.toCharArray()) {
            if (data == '*' || data == '+' || data == '-' || data == '/') {
                index = str.indexOf(data);
                break;
            }
        }
        if(index==0){
            throw new NotFound("Cannot perform operation as it need initial number or got illegal operator");
        }
        String first=str.substring(0,index);
        int n1=Integer.parseInt(first);
        String second=str.substring(index+1,str.length());
        if(second==null){
            throw new NotFound("Empty value after operator");
        }
        for(char data:second.toCharArray()){
            if(data=='*'||data=='+'||data=='-'||data=='%'){
                throw new NotFound("Cannot perform two exception");
            }
        }
        int n2=Integer.parseInt(second);
        char ch=str.charAt(index);
        String here=null;
        switch (ch){
            case '*':
                System.out.println("The product is "+(n1*n2));
                break;
            case '+':
                here="The sum is "+(n1+n2);
                return here;
            //System.out.println("The sum is "+(n1+n2));
            case '-':
                System.out.println("The difference is "+(n1-n2));
                break;
            case '/':
                if(n2==0){
                    throw new NotFound("Cannot divisible by Zero ");
                }else {
                    System.out.println("The divide is "+(float)n1/n2);
                }
                break;
            default:
                System.out.println("No any operation available");

        }
        return here;
    }
    public static void main(String[] args) throws NotFound{
        // check.Calculator("4+");
        JFrame frame=new JFrame("Simple Calculator");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel firstnumber=new JLabel("Enter first number :");
        firstnumber.setBounds(10,20,150,50);
        frame.add(firstnumber);
        JTextField num1=new JTextField();
        num1.setBounds(180,20,150,50);
        frame.add(num1);
        JLabel secondnumber=new JLabel("Enter second number:");
        secondnumber.setBounds(10,80,200,50);
        frame.add(secondnumber);
        JTextField num2=new JTextField();
        num2.setBounds(180,80,150,50);
        frame.add(num2);
        JButton btn=new JButton("Calculate");
        btn.setBounds(100,140,150,40);
        frame.add(btn);
        JLabel result=new JLabel();
        result.setBounds(10,190,400,60);
        result.setVisible(false);
        frame.add(result);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String data=null;
                data=num1.getText().toString()+"+"+num2.getText().toString();
                result.setVisible(true);
                try {
                    result.setText(check.Calculator(data));
                } catch (NotFound e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}