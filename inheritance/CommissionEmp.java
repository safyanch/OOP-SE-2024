
public class CommissionEmp extends Employee
{
    
    private double sale;
    private double comm;
    private double salary;
    public CommissionEmp(String n, int i, String des, double sale, double comm)
    {
        super(n, i, des);
        this.sale=sale;
        this.comm=comm;
        
    }
public void calculateSalary()
{
    System.out.println("salary of  "+getName()+"="+sale*comm);
}

}
