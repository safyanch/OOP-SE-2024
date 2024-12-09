
public abstract class  Employee
{
    final private String name;
    private int id;
    private String designation;
    public Employee(int i, String n, String d)
    {
        id=i;
        name=n;
        designation=d;
    }
    
     protected String getName()
    {
        return(name);
    }
    
    public abstract  void calculateSalary();
    
    
}
