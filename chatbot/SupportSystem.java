import java.util.HashSet;
public class SupportSystem
{
    
      
    public static void main(String args[])
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
        
        InPut reader=new InPut();
        Responses responder=new Responses();
        boolean finished = false;
       

        while(!finished) {
            HashSet<String> input = reader.getInput();

            if(input.contains("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        System.out.println("Nice talking to you. Bye...");
    }   
       
}