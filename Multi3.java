class Multi3 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multi3 m = new Multi3();
        Thread t = new Thread(m);  // Corrected from m1 to m
        t.start();
    }
}
