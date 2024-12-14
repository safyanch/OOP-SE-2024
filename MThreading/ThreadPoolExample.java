import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPoolExample {
    public static void main(String[] args) {
        // Define the number of threads in the pool
        int threadPoolSize = 3;

        // Create a ThreadPoolExecutor with a fixed size
        ExecutorService threadPool = Executors.newFixedThreadPool(threadPoolSize);

        // Simulate multiple orders to be processed
        String[] orderIds = {
            "ORD001", "ORD002", "ORD003", "ORD004", "ORD005", 
            "ORD006", "ORD007", "ORD008", "ORD009", "ORD010"
        };

        // Submit order processing tasks to the thread pool
        for (String orderId : orderIds) {
            threadPool.submit(new OrderProcessor(orderId));
        }

        // Shutdown the thread pool
        threadPool.shutdown();
        System.out.println("All tasks submitted.");
    }
}
