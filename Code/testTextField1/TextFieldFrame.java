 // import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
// import javax.swing.JFrame;
// import javax.swing.JTextField;
// import javax.swing.JPasswordField;
// import javax.swing.JOptionPane;
import javax.swing.*;
public class TextFieldFrame 
{
   JFrame f= new JFrame("Frame GCU");
private JTextField f1;
private JTextField f2;
private JTextField f3;
private JPasswordField f4;
    public TextFieldFrame()
    {
    //super("This is Textfield and Password Field Frame");
   // f.setLayout(new FlowLayout());

   f.setLayout(null);
    f1=new JTextField(30);
    f.add(f1);
  //  f1.setColumns(20);
 
  f1.setBounds(40,40,100,20);
        f2=new JTextField("Enter here for text");
    f.add(f2);
  f2.setBounds(40,70,100,20);
      f2.setColumns(20);
            f3=new JTextField("Uneditable Field",31);
            f3.setEditable(false);
    f.add(f3);
    f3.setBounds(40,100,100,20);
    
       // f3.setColumns(20);
    f4=new JPasswordField("Hidden Text");
    f.add(f4);
    f4.setBounds(40,130,100,20);
       // f4.setColumns(20);
    f.setSize(400,400);
    f.setVisible(true);
   handler h=new handler();
    f1.addActionListener(h);
    f2.addActionListener(h);
    f3.addActionListener(h);
   f4.addActionListener(h);    
}
   
   public class handler implements ActionListener
   {
  public void actionPerformed( ActionEvent event )
   {
   String s="";
   if(event.getSource()==f1)
   {
   s=String.format("textfield1: %s", event.getActionCommand());
   }
      else if(event.getSource()==f2)
   {
   s=String.format("textfield2: %s", event.getActionCommand());
   }
      else if(event.getSource()==f3)
   {
   s=String.format("textfield3: %s", event.getActionCommand());
   }
    else  if(event.getSource()==f4)
   {
   s=String.format("textfield4: %s", event.getActionCommand());
   }
JOptionPane.showMessageDialog(null, s);
}
   }
    
}
   
   
   
    
    

