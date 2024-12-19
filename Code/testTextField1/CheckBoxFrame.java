import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
public class CheckBoxFrame implements ItemListener
{
private JTextField textField; // displays text in changing fonts
// CheckBoxFrame constructor adds JCheckBoxes to JFrame
private JCheckBox boldJCheckBox; // to select/deselect bold
private JCheckBox italicJCheckBox;
 public CheckBoxFrame()
{
    JFrame f=new JFrame("JCheckBox Test");
//super( "JCheckBox Test" );
 f.setLayout( new FlowLayout() ); // set frame layout

 // set up JTextField and set its font
 textField = new JTextField( "Watch the font style change", 20 );
boldJCheckBox= new JCheckBox("Bold"); // create bold checkbox
italicJCheckBox = new JCheckBox( "Italic" );
f.add( textField ); // add textField to JFrame
f.add( boldJCheckBox ); // add bold checkbox to JFrame
f.add( italicJCheckBox );
// register listeners for JCheckBoxes
f.setSize( 275, 100 );
f.setVisible( true ); 
boldJCheckBox.addItemListener( this );
italicJCheckBox.addItemListener( this);
}


//private int valBold = Font.PLAIN; // controls bold font style
 //private int valItalic = Font.PLAIN;
public void itemStateChanged( ItemEvent event )
{
int valBold = Font.PLAIN; // controls bold font style
int valItalic = Font.PLAIN;
    if(event.getSource()==boldJCheckBox )
 valBold =boldJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
 // process italic checkbox events
if(event.getSource()==italicJCheckBox)
 valItalic =italicJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
 //set text field font
textField.setFont(new Font( "Serif", valBold+valItalic, 20 ) );
 } // end method itemStateChanged
} // end pri

