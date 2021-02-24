class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();


        t1.join();
        System.out.println("Are we done?");
    }
}
