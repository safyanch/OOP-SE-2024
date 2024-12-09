
public   class Employee
{
   String name;
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
   
   protected  void calculateSalary()
   {
       
   }
   
}
