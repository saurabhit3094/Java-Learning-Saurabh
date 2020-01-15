public class YieldSleepJoin {

    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new MyThread());
        Thread t1 = new Thread(new MyThread());
        t.start();
        t.join();
        t1.start();
        t1.join();
        t1.yield();
       // t1.sleep(2000);

        System.out.println("thread completed");
    }

}

class MyThread implements Runnable{
    public void run() {
        System.out.println("thread : " + Thread.currentThread().getId());
    }
}

