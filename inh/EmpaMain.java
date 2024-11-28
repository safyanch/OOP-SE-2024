import java.util.ArrayList;
public class EmpaMain
{
   public static void main(String args[]){
      
       ArrayList<Employee> lst=new ArrayList<Employee>();
       PermanentEmp emp1=new PermanentEmp(123, "ahmed", "admin officer", 19, 600000);
       DailyEmp emp2=new DailyEmp(124, "mehmed" , "Registrar", 240, 2500);
       CommissionEmp emp3=new CommissionEmp(125, "ali", "purchase officer", 10000000, .20);
       
       lst.add(emp1);
       lst.add(emp2);
       lst.add(emp3);
       for(Employee e:lst)
       {
           e.calculateSalary();
       }
       
    }
}
