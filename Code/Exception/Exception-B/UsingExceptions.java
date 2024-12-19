public class UsingExceptions
 {
 public static void method1()throws Exception
 {
method2();
 } // e 
   
 public static void method2()throws Exception
 {
method3();
 } //
     
 public static void method3()throws Exception
 {
throw new Exception( "Exception thrown in method3" );
 } // end method method3
 
 
public static void main( String args[] )
 {
 try
 {
method1();
 } // 
 catch ( Exception exception ) // catch exception thrown in method1
 {
     System.out.println("exception in  main method");
    }
}
}