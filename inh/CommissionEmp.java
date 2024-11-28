
public class CommissionEmp extends Employee
{
    private double sale;
    private double comm;
    double salary;
   public CommissionEmp(int i, String n, String d, double sale, double comm)
   {
       super(i,n,d);
       this.sale=sale;
       this.comm=comm;
       
   }
   public void calculateSalary()
   {
       salary=sale*comm;
       System.out.println("salary of"+getName()+"="+salary);
   }
}
