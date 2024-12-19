 /**
     This program demonstrates different types of
     dialog boxes.
  */
  
  import javax.swing.JOptionPane;
  
  public class TestAverageDialog
  {
    public static void main(String [] args)
    {
       String input,s;                // User input
       int score;  // test scores
      double average=0;
      double sum=0;
      int c=0;
      // Average test score
          // Confirm dialog button clicked
       
      do
       {
           String fnum=JOptionPane.showInputDialog("enter Score");
           score=Integer.parseInt(fnum);
           sum=sum+score;
           c++;
           s=JOptionPane.showInputDialog("Do you want more yes/no");              
    }
        while(s.equals("yes"));
JOptionPane.showMessageDialog(null,"Average Score="+sum/c, "AVERAGE", JOptionPane. INFORMATION_MESSAGE);
        
    
    }
}