import java.util.Scanner;
public class ClockMain
{
public static void main(String args[]) throws Exception
{
int hour, mint;
Scanner s=new Scanner(System.in);
System.out.print("enter time mintues and hours");
mint=s.nextInt();
hour=s.nextInt();

Clock c=new Clock();
c.setTime(hour,mint);
for (int i=0; i<=5; i++)
{
System.out.println(c.displayClock());
Thread.sleep(1000); 
c.tick();


}


}




}