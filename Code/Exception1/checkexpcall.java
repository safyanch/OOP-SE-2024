import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class checkexpcall
{
   public static void openFile1(String name)
{
    try{
        checkexp c=new checkexp();
        c.openFile(name);
    }
    catch(FileNotFoundException e)
    {
    System.out.println("file did not found");
    }
    }
}
