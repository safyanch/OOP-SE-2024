public class Dirver1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadLifecycle(), "Thread-1");
        Thread thread2 = new Thread(new ThreadLifecycle(), "Thread-2");

        System.out.println("Thread-1 State: " + thread1.getState()); // New
        thread1.start();
        thread2.start();

        System.out.println("Thread-1 State after start(): " + thread1.getState()); // Runnable

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread-1 State after join(): " + thread1.getState()); // Terminated
        
            }
}
