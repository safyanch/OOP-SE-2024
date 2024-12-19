import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener
{
JTextField f1=new JTextField();    
JTextField f2=new JTextField();
JTextField f3=new JTextField();
JButton b1=new JButton("+");
public Calculator()
{
super("my calculator");
setLayout(null);
f1.setBounds(40,40,100,30);
f2.setBounds(40,70,100,30);
f3.setBounds(40,100,100,30);
b1.setBounds(40,130,100,30);
f3.setEditable(false);
add(f1);
add(f2);
add(f3);
add(b1);
b1.addActionListener(this);
}

  public void actionPerformed( ActionEvent event )
{
   int num1=Integer.parseInt(f1.getText());
   int num2=Integer.parseInt(f2.getText());
        int sum=num1+num2;
   f3.setText(""+sum);
}
}
