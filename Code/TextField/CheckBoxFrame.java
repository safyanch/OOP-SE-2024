import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
public class CheckBoxFrame extends JFrame
{
private JTextField textField; // displays text in changing fonts
// CheckBoxFrame constructor adds JCheckBoxes to JFrame
private JCheckBox boldJCheckBox; // to select/deselect bold
private JCheckBox italicJCheckBox;
 public CheckBoxFrame()
{
super( "JCheckBox Test" );
 setLayout( new FlowLayout() ); // set frame layout

 // set up JTextField and set its font
 textField = new JTextField( "Watch the font style change", 20 );
boldJCheckBox= new JCheckBox("Bold"); // create bold checkbox
italicJCheckBox = new JCheckBox( "Italic" );
add( textField ); // add textField to JFrame
add( boldJCheckBox ); // add bold checkbox to JFrame
add( italicJCheckBox );
// register listeners for JCheckBoxes
CheckBoxHandler handler = new CheckBoxHandler();
boldJCheckBox.addItemListener( handler );
italicJCheckBox.addItemListener( handler );
}
private class CheckBoxHandler implements ItemListener
{
private int valBold = Font.PLAIN; // controls bold font style
 private int valItalic = Font.PLAIN;
public void itemStateChanged( ItemEvent event )
{

    
    
    if(event.getSource()==boldJCheckBox )
 valBold =boldJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
 // process italic checkbox events
if(event.getSource()==italicJCheckBox)
 valItalic =italicJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
 // set text field font
textField.setFont(new Font( "Serif", valBold + valItalic, 20 ) );
 } // end method itemStateChanged
} // end pri
}
