public class Job{
private int age;
private String name,post;

    public Job(String name,String post,int age){
    this.name=name;
    this.post=post;
    this.age=age;
    }
    
    public void calculateEligibility(){
        try{
        throw new Eligibility(post,age);
        }
        catch(Eligibility e)
        {
        
        }
        
    }
}