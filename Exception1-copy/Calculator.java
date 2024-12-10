import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator
{
    int x, y;
    Scanner s=new Scanner(System.in);
    public void add() throws InputMismatchException
    {
        try{
        System.out.println("enter the first number");
        x=s.nextInt();
        System.out.println("enter the second number");
        y=s.nextInt();
        
        int div=x/y;
        System.out.println("answer= "+div);
        
    }
    catch(ArithmeticException e)
    {
        System.out.println("answer= "+ x/1);
    }
   

}


}
