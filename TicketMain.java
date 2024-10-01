import java.util.Scanner;
public class TicketMain
{
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the Price: ");
       int p = input.nextInt();
       TicketMachine m1 = new TicketMachine(p);
       do{
         System.out.println("1. Insert Money");
         System.out.println("2. Print ticket");
         System.out.println("3. Get Balance");
         System.out.println("4. Refund Amount");
         System.out.println("Enter Your Choice: ");
         int choice = input.nextInt();
         switch(choice):
            case 1:
                int p1 ;
                System.out.println("Enter the Amount : ");
                p1 = input.nextInt();
                m1.insertMoney(p1);
                break;
            case 2:
                m1.printTicket;
                break;
       }while(true);
   }
}
