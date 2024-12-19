import java.awt.event.*;
import javax.swing.*;
 
public class JMenuExample extends JFrame implements ActionListener {
 
        public JMenuExample() {
 
        super("JMenu Example");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
 
        // Name the JMenu & Add Items
        JMenu menu = new JMenu("File");
        menu.add(JMenueItem("Open"));
        menu.add(makeMenuItem("Save"));
        menu.add(makeMenuItem("Quit"));
 
        // Add JMenu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);
        setSize(300, 300);
        setLocation(200, 200);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
 
        // Menu item actions
        String command = e.getActionCommand();
 
        if (command.equals("Quit")) {
            System.exit(0);
        } else if (command.equals("Open")) {
            // Open menu item action
            System.out.println("Open menu item clicked");
        } else if (command.equals("Save")) {
            // Save menu item action
            System.out.println("Save menu item clicked");
        }
    }
 
//     private JMenuItem makeMenuItem(String name) {
//         JMenuItem m = new JMenuItem(name);
//         m.addActionListener(this);
//         return m;
//     }
public static void main(String[] s) {
        new JMenuExample();
    }

}