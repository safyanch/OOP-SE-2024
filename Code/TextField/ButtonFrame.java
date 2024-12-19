import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
public class ButtonFrame extends JFrame
 {
private JButton plainJButton; // button with just text
private JButton fancyJButton; // button with icon
 // ButtonFrame adds JButtons to JFrame
public ButtonFrame()
{
super("Testing Buttons");
setLayout(new FlowLayout());
plainJButton=new JButton("Plain Button");
add(plainJButton); // add plainJButton to JFrame
Icon bug1 = new ImageIcon( getClass().getResource( "image.icon" ) );
//Icon bug2 = new ImageIcon( getClass().getResource( "image.icon" ) );
fancyJButton = new JButton( "Fancy Button", bug1 ); // set image

//fancyJButton.setRolloverIcon( bug2 ); // set rollover image

//fancyJButton = new JButton( "Fancy Button"); // set image
add(fancyJButton); // add fancyJButton to JFrame
ButtonHandler h=new ButtonHandler();
plainJButton.addActionListener(h);
fancyJButton.addActionListener(h);
} // end ButtonFrame constructor
// inner class for button event handling


private class ButtonHandler implements ActionListener
{
// handle button event
public void actionPerformed( ActionEvent event )
{
JOptionPane.showMessageDialog( ButtonFrame.this, String.format( "You pressed: %s", event.getActionCommand()));
} // end method actionPerformed47 } // end private inner class ButtonHandler
}
}
