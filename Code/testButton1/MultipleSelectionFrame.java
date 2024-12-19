import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
public class MultipleSelectionFrame extends JFrame
{
private JList colorJList; // list to hold color names
private JList copyJList; // list to copy color names into
private JButton copyJButton; // button to copy selected names
private final String colorNames[] = { "Black", "Blue", "Cyan",
 "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
 "Pink", "Red", "White", "Yellow" };

 // MultipleSelectionFrame constructor
 public MultipleSelectionFrame()
{
super( "Multiple Selection Lists" );
setLayout( new FlowLayout() ); // set frame layout

colorJList = new JList( colorNames ); // holds names of all colors
colorJList.setVisibleRowCount( 5 ); // show five rows


add( new JScrollPane( colorJList ) ); // add list with scrollpane

copyJButton = new JButton( "Copy >>>" ); // create copy button
add( copyJButton ); // add copy button to JFrame
copyJList = new JList(); // create list to hold copied color names
copyJList.setVisibleRowCount( 5 );
copyJList.setFixedCellWidth( 100 ); // set width
copyJList.setFixedCellHeight( 15 ); // set height
//copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION );
add( new JScrollPane( copyJList ) ); // add list with scrollpane
multsel h=new multsel();
copyJButton.addActionListener(h);
//copyJButton.addActionListener( new ActionListener() // anonymous inner class
}
 public class multsel implements ActionListener
 {
 // handle button event
 public void actionPerformed( ActionEvent event )
 {
 // place selected values in copyJList
copyJList.setListData( colorJList.getSelectedValues() );
} // end method actionPerformed
} // end anonymous inner class
 // end call to addActionListener
 // end MultipleSelectionFrame constructor
// end c
}