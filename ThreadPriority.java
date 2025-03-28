class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        // Creating three threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Setting names for the threads
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        // Displaying initial priorities
        System.out.println("Initial Priorities:");
        t1.start();
        t2.start();
        t3.start();

        // Changing thread priorities
        try {
            // Sleep to ensure initial priorities are displayed before changing them
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Setting new priorities
        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10

        // Displaying new priorities
        System.out.println("\nNew Priorities:");
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
        MyThread t6 = new MyThread();

        t4.setName("Thread 1 (Updated)");
        t5.setName("Thread 2 (Updated)");
        t6.setName("Thread 3 (Updated)");

        t4.setPriority(t1.getPriority());
        t5.setPriority(t2.getPriority());
        t6.setPriority(t3.getPriority());

        t4.start();
        t5.start();
        t6.start();
    }
}