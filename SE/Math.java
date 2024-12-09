
public class Math implements Compare
{
    public boolean isGreater( Object x, Object y)
    {
        Integer a, b;
        a= (Integer)x;
        b=(Integer)y;
        if(a>b)
        return(true);
        else 
        return(false);
    }
    public boolean isEqual( Object x, Object y)
    {
        Integer a, b;
        a= (Integer)x;
        b=(Integer)y;
        if(a==b)
        return(true);
        else 
        return(false);
    }
    
}
