import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class RadioButtonFrame extends JFrame  
{
private JTextField textField; // used to display font changes
// Fonts Types
private Font plainFont=new Font( "Serif", Font.PLAIN, 14 ); // font for plain text
private Font boldFont=new Font( "Serif", Font.BOLD, 14 ); // font for bold text
private Font italicFont= new Font( "Serif", Font.ITALIC, 14 ); // font for italic text
private Font boldItalicFont= new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
// Button Types
private JRadioButton plainJRadioButton; // selects plain text
private JRadioButton boldJRadioButton; // selects bold text
private JRadioButton italicJRadioButton; // selects italic text
private JRadioButton boldItalicJRadioButton;
// Radio Groups
private ButtonGroup radioGroup;
// Constructors
public RadioButtonFrame()
{
super( "RadioButton Test" );
setLayout( new FlowLayout() ); // set frame layout
textField = new JTextField( "Watch the font style change", 25 );
add( textField ); // add textField
plainJRadioButton = new JRadioButton( "Plain", true );
boldJRadioButton = new JRadioButton( "Bold", false );
italicJRadioButton = new JRadioButton( "Italic", false );
boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false );
// add radio button into frame
add( plainJRadioButton ); // add plain button to JFrame
add( boldJRadioButton ); // add bold button to JFrame
add( italicJRadioButton ); // add italic button to JFrame
add( boldItalicJRadioButton );
 // create ButtonGroup
radioGroup = new ButtonGroup();
// Adding Radio Button into Groups
radioGroup.add( plainJRadioButton ); // add plain to group
radioGroup.add( boldJRadioButton ); // add bold to group
radioGroup.add( italicJRadioButton ); // add italic to group
radioGroup.add( boldItalicJRadioButton );
textField.setFont( plainFont ); // set initial font to plain
plainJRadioButton.addItemListener(new RadioButtonHandler( plainFont ) );
boldJRadioButton.addItemListener(new RadioButtonHandler( boldFont ) );
italicJRadioButton.addItemListener(new RadioButtonHandler( italicFont ) );
boldItalicJRadioButton.addItemListener(new RadioButtonHandler( boldItalicFont ) );
}
private class RadioButtonHandler implements ItemListener
{
private Font font;
public RadioButtonHandler( Font f )
{
font = f; //
}
public void itemStateChanged( ItemEvent event )
{
  
textField.setFont( font );
} // end method itemStateChanged
} // end private inner class RadioButtonHandler
} // end
