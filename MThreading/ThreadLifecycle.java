
class ThreadLifecycle implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(1000); // Simulates the thread being in a waiting state
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}