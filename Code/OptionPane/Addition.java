import javax.swing.JOptionPane;

public class Addition
{
public void add()
{
    
String fnum=JOptionPane.showInputDialog("Enter First Number");
String snum=JOptionPane.showInputDialog("Enter Second Number");
int num1=Integer.parseInt(fnum);
int num2=Integer.parseInt(snum);
int sum=num1+num2;

JOptionPane.showMessageDialog(null,"Sum="+sum, "sum of two integer", JOptionPane. ERROR_MESSAGE);
}
public static void main(String args[])
{
Addition a=new Addition();
a.add();
}
}


