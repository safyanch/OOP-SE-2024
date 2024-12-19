package Text;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{
private JTextField f1;
private JTextField f2;
private JTextField f3;
private JPasswordField f4;
    public TextFieldFrame()
    {
    super("This is Textfield and Password Field Frame");
    setLayout(new FlowLayout());
    f1=new JTextField(10);
    add(f1);
        f2=new JTextField("Enter here for text");
    add(f2);
            f3=new JTextField("Uneditable Field",31);
            f3.setEditable(false);
    add(f3);
    f4=new JPasswordField("Hidden Text");
    add(f4);
    
    TextFieldHandler h=new TextFieldHandler();
    f1.addActionListener(h);
    f2.addActionListener(h);
    f3.addActionListener(h);
   f4.addActionListener(h);    
}
   
   private class TextFieldHandler implements ActionListener
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
    
    
