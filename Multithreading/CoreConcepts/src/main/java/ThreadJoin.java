import java.util.concurrent.CyclicBarrier;

public class ThreadJoin {
    public static void main(String args[]) {

        //CyclicBarrier barrier = new CyclicBarrier();

        Thread th[] = new Thread[5];
        for(int i = 0; i < 5; i++) {
            th[i] = new Thread(() -> {
                int wait = (int)(Math.random() * 10000);
                Thread currentThread = Thread.currentThread();
                System.out.println("In thread " + currentThread.getName() + " sleeping for " + wait + "ms");
                try {
                    currentThread.sleep(wait);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            th[i].start();
        }


        for(int i = 0; i < 5; i++) {
            try {
                th[i].join();
                System.out.println(th[i].getName() + " done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("exiting main thread");
    }
}
