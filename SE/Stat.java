
public class Stat implements Compare
{
    public boolean isGreater( Object x, Object y)
    {
        Person a, b;
        a= (Person) x;
        b=(Person) y;
        return(a.getAge()>b.getAge());
    }
    
    public boolean isEqual( Object x, Object y)
    {
        Person a, b;
        a= (Person) x;
        b=(Person) y;
        return((a.getAge())==(b.getAge()));
    }
}
