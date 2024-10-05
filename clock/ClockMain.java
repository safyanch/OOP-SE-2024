import java.util.Scanner;
public class ClockMain
{
public static void main(String args[]) throws Exception
{


int mint, sec, start;
Scanner s=new Scanner(System.in);
ClockDisplay c=new ClockDisplay();
System.out.print("enter time Mintues and Seconds");
mint=s.nextInt();
sec=s.nextInt();
c.setTime(mint,sec);

for (int i=0; i<=5; i++)
{
System.out.println(c.getTime());
Thread.sleep(1000); 
c.timeTick();


}


}




}