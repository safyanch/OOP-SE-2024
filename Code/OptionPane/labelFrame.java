import javax.swing.*;
import java.awt.*;
public class labelFrame  extends JFrame
{   
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    public labelFrame()
    {
   
        super("My First Frame");
   setLayout(new FlowLayout());
   label1=new JLabel("----label with text-----");
   label1.setToolTipText("This is label1");
   add(label1);
   label2=new JLabel("label with text and icon ", SwingConstants.LEFT);
   label2.setToolTipText("this is label2");
   add(label2);
   label3=new JLabel();
   label3.setText("label with icon and text at bottom");
Icon bug=new ImageIcon(("E:\\image.icon"));
    label3.setIcon(bug);
   label3.setHorizontalTextPosition(SwingConstants.CENTER);
   label3.setVerticalTextPosition(SwingConstants.BOTTOM);
   label3.setToolTipText("this is label3");
   add(label3);
   
}
   
   public static void main(String[] args)
{
    labelFrame f=new labelFrame();
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setSize(460, 480);
f.setVisible(true);
}
}
