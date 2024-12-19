import java.awt.*;   
import javax.swing.*;   
import java.awt.event.*;   
public class ButtonFrame extends JFrame
 {
private JButton plainJButton; // button with just text
private JButton fancyJButton; // button with icon
 public ButtonFrame()
{
super("Testing Buttons");
setLayout(new FlowLayout());
plainJButton=new JButton("Plain Button");
add(plainJButton); // add plainJButton to JFrame
Icon bug1 = new ImageIcon( getClass().getResource( "image.icon" ) );
fancyJButton = new JButton( "Fancy Button", bug1 ); // set image
add(fancyJButton); // add fancyJButton to JFrame
ButtonHandler h=new ButtonHandler();
plainJButton.addActionListener(h);
fancyJButton.addActionListener(h);
} // end ButtonFrame constructor
class ButtonHandler implements ActionListener
{
// handle button event
public void actionPerformed( ActionEvent event )
{
//JOptionPane.showMessageDialog( null, String.format( "You pressed: %s", event.getActionCommand()));
JOptionPane.showMessageDialog( null, "You Pressed"+event.getActionCommand());
} // end method actionPerformed47 } // end private inner class ButtonHandler
}



}







 