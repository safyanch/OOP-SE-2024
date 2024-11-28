
public abstract class Employee
{
   private String name;
   private int id;
   private String designation;
   
   public Employee(String n, int i, String des)
   {
       name=n;
       id=i;
       designation=des;
   }
   
   protected String getName()
   {
      return(name);
       
   }
   
   public abstract void calculateSalary();
   
}
