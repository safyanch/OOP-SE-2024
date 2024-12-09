public class BasePlusComm extends CommissionEmp
{
    
    private double baseSale;
    private double sale;
    private double comm;
    public BasePlusComm(int i, String n, String d, double sale, double comm, double baseSale)
    {
        super( i, n, d, sale,  comm);
        this.baseSale=baseSale;
        this.sale=sale;
        this.comm=comm;
    }
    
    public void calculateSalary()
   {
       salary=sale*comm;
       System.out.println("salary of"+getName()+"="+salary+baseSale);
   }

}
