
public class BasePlusComm extends CommissionEmp
{

    private double baseSal;
    private double sale;
    private double comm;
    public BasePlusComm(String n, int i, String des, double sale, double comm, double baseSal)
    {
        super( n, i,  des,  sale,  comm);
        this.baseSal=baseSal;
        this.sale=sale;
        this.comm=comm;
    }
    
    protected  void calculateSalary()
{
    System.out.println("salary of  "+getName()+"="+sale*comm+baseSal);
}
}
