public class UsingTraceExceptions
 {
     // call method2; throw exceptions back to main
 public static void method1()throws Exception
 {
method2();
 } // end method method1

 // call method3; throw exceptions back to method1
 public static void method2()throws Exception
 {
method3();
 } // end method method2

 // throw Exception back to method2
 public static void method3()throws Exception
 {
throw new Exception(  );
 } // end method method3
 public static void main( String args[] )
 {
 try
 {
method1();
 } // end try
 catch ( Exception e ) // catch exception thrown in method1
 {
StackTraceElement[] t = e.getStackTrace();
 System.out.println( "Class\t\t\t\tFile\t\t\tLine\tMethod" );
int i=0;
 // loop through traceElements to get exception description
 for ( StackTraceElement element : t )
 {
     //i=i+1;
    // System.out.printf( "%d\t", i);
 System.out.printf( "%s\t", element.getClassName());
 System.out.printf( "%s\t",element.getFileName());
 System.out.printf( "%s\t", element.getLineNumber());
 System.out.printf( "%s\n", element.getMethodName());
 } // end for
 } // end catch
 } // end ma
 } // end class UsingExceptions



 
 