
public class TicketMachine
{
    private int price;
    private int total;
    private int balance;
    
    public TicketMachine(int price){
        this.price = price ;
        total = 0 ;
        balance = 0 ;
    }
    
    public void insertMoney(int value){
        balance = value ;
    }
    
    
    public void printTicket(){
        if(balance >= price){
        System.out.println("Welcome to Metro Machine");
        System.out.println("Price = 50");
        System.out.println("------------------------");
        balance = balance - price ;
        total = total + price ;
        }
        else{
        System.out.println("Insufficient Balance!" + (price - balance));
        }
        
    }
    public int refund(){
        int temp ;
        temp =  balance ;
        balance = 0 ;
        return temp;
        
    }
    
    public int getBalance(){
        return balance ;
    }
    
    public int totalRevenue(){
        return total;
    }
        
}
