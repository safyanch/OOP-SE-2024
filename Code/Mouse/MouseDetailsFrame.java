import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MouseDetailsFrame extends JFrame
{
private String details; // String representing
private JLabel statusBar; // JLabel that appears at bottom of window
// constructor sets title bar String and register mouse listener
 public MouseDetailsFrame()
{
super( "Mouse clicks and buttons" );
statusBar = new JLabel( "Click the mouse" );
add( statusBar, BorderLayout.SOUTH );
addMouseListener( new MouseClickHandler() ); //
}

private class MouseClickHandler extends MouseAdapter
{
// handle mouse-click event and determine which button was pressed
public void mouseClicked( MouseEvent event )
{
int xPos = event.getX(); // get x-position of mouse
int yPos = event.getY(); // get y-position of mouse
details = String.format( "Clicked %d time(s)",event.getClickCount() );

 if(event.isAltDown() )// right mouse button
 details += " with right mouse button";
else if(event.isAltDown() )// middle mouse button
 details += " with center mouse button";
 else // left mouse button
 details += " with left mouse button";

statusBar.setText( details ); // display message in statusBar
 } // end method mouseClicked
} // end private inner class MouseClickHandler
} // end class MouseDetailsFrame

