public class Dirver{
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start(); // Start the thread
    
    for(int i=0; i<100; i++)
         System.out.println("parent thread="+i);
    }
}