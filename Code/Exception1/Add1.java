import java.util.Scanner;
import java.util.InputMismatchException;
public class Add1
{
public static int div(int x, int y) //throws ArithmeticException
{
return(x/y);
}
public static void main(String args[])
{
    boolean contiloop=true;
do
{
//     try
//     {
Scanner s=new Scanner(System.in);
System.out.println("enter first no.");
int num1=s.nextInt();
System.out.println("enter Second no.");
int num2=s.nextInt();
if(num2==0)
throw new ArithmeticException();
int d=div(num1, num2);
System.out.println("answer="+d);
contiloop=false;    
//}
//     catch(ArithmeticException arithmatic)
//     {
//     System.out.println("zero can t be divisor");
//     System.out.println("try again");
//     }
//     catch(InputMismatchException input)
//     {
//     Exception e=new Exception();
// //    System.out.println(e.);
//         //System.out.println("String can not be divisor");
//     //System.out.println("try again");
//     }
//     finally
//     {
//     System.out.println("try again");
//     }
}
while(contiloop);
}
}
