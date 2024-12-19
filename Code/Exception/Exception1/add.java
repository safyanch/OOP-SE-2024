import java.util.Scanner;
import java.util.InputMismatchException;
public  class add
{
public   void div() throws ArithmeticException, InputMismatchException 
{
Scanner s=new Scanner(System.in);
System.out.println("ente first no.");
int a=s.nextInt();    
System.out.println("ente Second no.");
int b=s.nextInt();    

    int  z= a/b;
    System.out.println("answer="+z);
}
}