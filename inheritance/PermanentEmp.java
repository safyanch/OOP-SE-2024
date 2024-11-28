
public class PermanentEmp extends Employee
{
    private int grad;
    private double salary;
    private double bpay;
    
    public PermanentEmp(String n, int i, String des, int grad, double bpay)
    {
        super(n, i, des);
        this.grad=grad;
        this.bpay=bpay;
    }
    
    public void calculateSalary()
    {
        salary=bpay+(bpay*.45)+(bpay*.3)+10000;
        System.out.println("salary of  "+getName()+"="+salary);
    }
    
}
