import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleCalculator extends JFrame{
    static String operator=null;
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
                throw new NotFound("Cannot perform two operation");
            }
        }
        int n2=Integer.parseInt(second);
        char ch=str.charAt(index);
        String here=null;
        switch (ch){
            case '*':
                return "The product is "+(n1*n2);
            case '+':
                return "The sum is "+(n1+n2);
            case '-':
                return "The difference is "+(n1-n2);
            case '/':
                if(n2==0){
                    throw new NotFound("Cannot divisible by Zero ");
                }else {
                   return "The divide is "+(float)n1/n2;
                }
            default:

                return "No any operation available";
        }
    }
    public static void main(String[] args) throws NotFound{
        // check.Calculator("4+");
        JFrame frame=new JFrame("Simple Calculator");
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel firstnumber=new JLabel("Enter first number :");
        firstnumber.setBounds(10,20,150,50);
        frame.add(firstnumber);
        JTextField num1=new JTextField();
        num1.setBounds(180,20,150,40);
        frame.add(num1);
        JButton add=new JButton("+");
        add.setBounds(20,80,50,40);
        frame.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator="+";
            }
        });
        JButton sub=new JButton("-");
       sub.setBounds(90,80,40,40);
        frame.add(sub);
       sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator="-";
            }
        });
        JButton mult=new JButton("*");
        mult.setBounds(150,80,40,40);
        frame.add(mult);
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator="*";
            }
        });
        JButton div=new JButton("/");
       div.setBounds(210,80,40,40);
        frame.add(div);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator="/";
            }
        });
        JLabel secondnumber=new JLabel("Enter second number:");
        secondnumber.setBounds(10,150,200,50);
        frame.add(secondnumber);
        JTextField num2=new JTextField();
        num2.setBounds(180,150,150,40);
        frame.add(num2);
        JButton btn=new JButton("Calculate");
        btn.setBounds(100,200,150,40);
        frame.add(btn);
        JLabel result=new JLabel();
        result.setBounds(10,240,600,60);
        result.setVisible(false);
        frame.add(result);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String data=null;
                data=num1.getText().toString()+operator+num2.getText().toString();
                result.setVisible(true);
                try {
                    result.setText(SimpleCalculator.Calculator(data));
                } catch (NotFound e) {
                    result.setText(e.getLocalizedMessage());
                }
            }
        });
    }
}
