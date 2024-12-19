import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalFrame 
{
    JFrame f=new JFrame("My Calculator");
private JTextField f1;
private JTextField f2;
private JTextField f3;
private JButton sumbutton; 
int num1, num2, sum;

    public CalFrame()
    {
    //super("This is Textfield and Password Fmield Frame");
   // f.setLayout(new FlowLayout());
f.setLayout(null);
    f1=new JTextField(30);
    f.add(f1);
   
  //  f1.setColumns(20);
  f1.setBounds(40,40,100,30);
        f2=new JTextField(30);
    f.add(f2);
       
  f2.setBounds(40,70,100,30);
      f2.setColumns(20);
            f3=new JTextField(30);
            f3.setEditable(false);
    f.add(f3);
    f3.setBounds(40,100,100,20);
    sumbutton=new JButton("+");
    f.add(sumbutton);
    sumbutton.setBounds(160,70,50,20);
    f.setSize(400,400);
    f.setVisible(true);
   E h=new E();
    sumbutton.addActionListener(h);
}
public class E implements ActionListener
{   
 public void actionPerformed( ActionEvent event )
{
   num1=Integer.parseInt(f1.getText());
   num2=Integer.parseInt(f2.getText());
        sum=num1+num2;
   f3.setText(""+sum);

   // JOptionPane.showMessageDialog( null, String.format( "You pressed: %s", event.getActionCommand()));
} //ButtonFrame.this end method actionPerformed47 } // end private inner class ButtonHandler
  } 
  
  
  public static void main( String args[] )
 {
  CalFrame CFrame = new CalFrame();
//  textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//  textFieldFrame.setSize( 500, 500 ); // set frame size
//  textFieldFrame.setVisible( true ); // display frame
 } // end ma
}