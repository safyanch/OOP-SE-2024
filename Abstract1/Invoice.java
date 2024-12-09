public class Invoice implements Payable
{
double  pno;
double  qty;
double  price;
public Invoice(double a, double b, double c)
{
pno=a;
qty=b;
price=c;
}
public double getpaymentamount()
{
return qty*price;
}
}
