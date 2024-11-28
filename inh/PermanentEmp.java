
public class PermanentEmp extends Employee
{
    private double bpay;
    private int grad;
    private double salary;
    
    public PermanentEmp(int i, String n, String d, int grad, double bpay)
    {
        super(i, n,  d);
        this.grad=grad;
        this.bpay=bpay;
        
    }
   
    public void calculateSalary()
    {
        salary=bpay+(bpay*.45)+(bpay*.3)+10000;
        System.out.println("salary of"+getName()+"="+salary);
    }
}
