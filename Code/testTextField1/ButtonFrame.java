import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
public class ButtonFrame extends JFrame implements ActionListener
 {
private JButton plainJButton; // button with just text
private JButton fancyJButton; // button with icon
 // ButtonFrame adds JButtons to JFrame
 Icon bug1 = new ImageIcon( "d://image.icon" );
//Icon bug2 = new ImageIcon("d://abc.icon" ) ;
public ButtonFrame()
{
super("Testing Buttons");
setLayout(new FlowLayout());
plainJButton=new JButton("Plain Button");
add(plainJButton); // add plainJButton to JFrame
Icon bug1 = new ImageIcon( "d://image.icon" );
//Icon bug2 = new ImageIcon("d://abc.icon" ) ;
fancyJButton = new JButton( "Fancy Button", bug1 ); // set image

//fancyJButton.setRolloverIcon( bug2 ); // set rollover image

//fancyJButton = new JButton( "Fancy Button"); // set image
add(fancyJButton); // add fancyJButton to JFrame
//ButtonHandler h=new ButtonHandler();
plainJButton.addActionListener(this);
fancyJButton.addActionListener(this);
} // end ButtonFrame constructor
// inner class for button event handling

//fancyJButton.setBackground(Color.PINK);

// handle button event
public void actionPerformed( ActionEvent event )
{
  
   
JOptionPane.showMessageDialog( null, String.format( "You pressed: %s", event.getActionCommand()));
} //ButtonFrame.this end method actionPerformed47 } // end private inner class ButtonHandler

}
