class MyRunnable implements Runnable {
  
    public void run() {
        for(int i=0; i<100; i++)
         System.out.println("Thread-1="+i);
    }
}

