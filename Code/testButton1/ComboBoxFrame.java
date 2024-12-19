import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ComboBoxFrame extends JFrame
{
private JComboBox imagesJComboBox;
private JLabel label; // label to display selected icon
private String names[]={ "image", "DukeWave", "stamp", "image" };
private Icon icons[] = {
new ImageIcon( getClass().getResource( "image.icon" ) ),
new ImageIcon( getClass().getResource("DukeWave.gif" ) ),
new ImageIcon( getClass().getResource( "stamp.gif") ),
new ImageIcon( getClass().getResource( "image.icon" ) ) };
public ComboBoxFrame()
{
super( "Testing JComboBox" );
setLayout( new FlowLayout());
imagesJComboBox = new JComboBox( names ); // set up JComboBox
imagesJComboBox.setMaximumRowCount(3);
add( imagesJComboBox );
label = new JLabel( icons[ 0 ] );
add( label ); //
combohandler h=new combohandler();
imagesJComboBox.addItemListener(h);
}
private class combohandler implements ItemListener
{
    
// handle JComboBox event
public void itemStateChanged(ItemEvent event)
{
// determine whether checkbox selected
if ( event.getStateChange() == ItemEvent.SELECTED )
label.setIcon( icons[imagesJComboBox.getSelectedIndex() ] );
} // end method itemStateChanged
} // end anonymous inner class
 // end call to addItemList
//==
//} // end ComboBoxFrame constructor
//} //
}