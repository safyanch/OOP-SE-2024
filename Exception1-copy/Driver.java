import java.util.InputMismatchException;
public class Driver
{
    Calculator c=new Calculator();
    public void div()
    {
        try
        {
            c.add();
        }
        catch(InputMismatchException e)
        {
            System.out.println("fldjfljlsjf");
        }
        finally
        {
            System.out.println("ljfdjflsdlfjl sdfljdsfjldsjfljsdjl");
        }
    }
}
