import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class ImageViewer1 extends JFrame implements ActionListener
{
public  ImageViewer1()
{
    super("ImageViewer");
  JMenuBar menubar = new JMenuBar();
setJMenuBar(menubar);
JMenu fileMenu = new JMenu("File");
menubar.add(fileMenu);
JMenuItem openItem = new JMenuItem("Open");
openItem.addActionListener(this);
fileMenu.add(openItem);
JMenuItem quitItem = new JMenuItem("Quit");
quitItem.addActionListener(this);
fileMenu.add(quitItem);
}
public void actionPerformed(ActionEvent event)
{
System.out.println("Menu item: " + event.getActionCommand());
}



}