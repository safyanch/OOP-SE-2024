import javax.swing.JFrame;
public class MouseTracker
 {
public static void main( String args[] )
{
MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
mouseTrackerFrame.setSize( 500, 500 ); // set frame size
mouseTrackerFrame.setVisible( true ); // display frame
} // end main
} // end class MouseTracker