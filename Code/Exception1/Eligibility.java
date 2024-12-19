public class Eligibility extends Exception{

    public Eligibility(String post,int age){
        if(post.equals("Deputy Director")){
        if(age<30||age>40){
        System.out.println("You are not Eligible for "+post);
        }
        else
        System.out.println("You are eligible "+post);
        }
        else
        if(post.equals("Lecturer")){
        if(age<25||age>35){
        System.out.println("You are not Eligible for "+post);
        }
        else
        System.out.println("You are eligible "+post);
        }
        
        
    }
}