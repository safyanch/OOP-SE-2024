
public class DailyEmp extends Employee
{
   private double hour;
   private double hourW;
   private double salary;
   public DailyEmp(int i, String n, String d, double h, double hw)
   {
       super( i,  n,  d);
       hour=h;
       hourW=hw;
   }
   public void calculateSalary()
   {
       salary=hour*hourW;
       System.out.println("salary of"+getName()+"="+salary);
   }
   
}
