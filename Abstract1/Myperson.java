
public class Myperson implements Comparison
{
 public int isGreater(Object a, Object b)
{
    Person a1=(Person) a;
    Person b1=(Person) b;
if (a1.getage()>b1.getage())
return 1;
else 
return 0;
}

public int isLess(Object a, Object b)
{
    Person a1=(Person) a;
    Person b1=(Person) b;
if (a1.getage()<b1.getage())
return 1;
else 
return 0;
}

public int issEqual(Object a, Object b)
{
    Person a1=(Person) a;
    Person b1=(Person) b;
if (a1.getage()==b1.getage())
return 1;
else 
return 0;
}
   
}
