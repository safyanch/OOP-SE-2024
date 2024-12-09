 
public class Driver
{
    public static void main(String args[])
    {
        Stat s=new Stat();
        Person p1=new Person(19, "ahmed");
        
        Person p2=new Person(20, "ali");
        if(s.isGreater(p1,p2))
        System.out.println(p1.getName()+" is greater than"+p2.getName());
        else
        System.out.println(p2.getName()+" is greater than"+p1.getName());
    }
}
