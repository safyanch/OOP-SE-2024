public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
        
        for(int i=0; i<100; i++)
         System.out.println("parent thread="+i);

}
    }
