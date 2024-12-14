
class OrderProcessor implements Runnable {
    private final String orderId;

    public OrderProcessor(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Processing order: " + orderId + " by " + Thread.currentThread().getName());
        try {
            // Simulate processing time
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            System.err.println("Order processing interrupted: " + orderId);
        }
        System.out.println("Order processed: " + orderId + " by " + Thread.currentThread().getName());
    }
}