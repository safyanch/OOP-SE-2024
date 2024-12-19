import java.util.InputMismatchException;
public class callingadd
{
public void add_dip()
{
try
{
add a=new add();
a.div();
}
catch(ArithmeticException a)
{
System.out.println("Divisor can not be zero");
}
catch(InputMismatchException input)
    {
    System.out.println("Must be valid divisor");
     }
}
}
