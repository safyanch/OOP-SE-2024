import java.util.Scanner;
import java.util.HashSet;
public class InPut

{
    public HashSet<String> getInput()
    {
    HashSet<String> hs=new HashSet<String>();
    Scanner kb=new Scanner(System.in);
    String s=kb.nextLine();
    String arr[]=s.split(" ");
    
    for(String s1:arr)
    hs.add(s1);
    
    return (hs);
}
}
