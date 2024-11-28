
public class DailyEmp extends Employee
{
    private double hour;
    private double hourW;
    private int contNo;
    private double salary;
    public DailyEmp(String n, int i, String des, int c, double h, double hw)
    {
        super( n, i, des);
        contNo=c;
        hour=h;
        hourW=hw;
    }
   
    
    public void calculateSalary()
    {
        salary=hour*hourW;
        System.out.println("salary of  "+getName()+"="+salary);
    }
}
