import java.util.ArrayList;
public class EmpMain
{
    public static void main(String args[])
    {   
        ArrayList<Employee> lst=new ArrayList<Employee>();
        Employee emp1=new PermanentEmp("ahmed", 122, "admin officer", 17, 600000);
        DailyEmp emp2=new DailyEmp("Mehmed", 123, "kanongo", 123123, 240, 2500);
        //Employee emp3=new Employee("ahmed2", 124, "admin officer2");
        CommissionEmp emp4=new CommissionEmp("ali" ,124, "purchase officer", 2000000, .20);
        lst.add(emp1);
        lst.add(emp2);
        lst.add(emp4);
        for(Employee e:lst)
        {
            e.calculateSalary();
        }
        
        
        
        

        
    }
}
