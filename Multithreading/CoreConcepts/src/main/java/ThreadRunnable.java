import java.util.concurrent.*;

public class ThreadRunnable {


    public static void main(String[] args) throws Exception{
        //Using Thread Start
        for (int i=0;i<10;i++){


            ThreadUsingThreadClass t =  new ThreadUsingThreadClass(5);
            t.start();
            t.join();

            Thread t2 = new Thread(new ThreadUsingRunnableInterface(7));
            t2.start();

        }

        System.out.println("==========");

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0;i<10;i++){

        ThreadUsingCallableInterface tci = new ThreadUsingCallableInterface();
        Future f = executorService.submit(tci);
        int futureValue = (int) f.get();
            System.out.println("object >>>>>> " + futureValue);
            while(!executorService.awaitTermination(2000,TimeUnit.MILLISECONDS)){

        }
            ThreadUsingThreadClass t =  new ThreadUsingThreadClass(Integer.parseInt(f.get().toString()));
            executorService.execute(t);

            ThreadUsingRunnableInterface t2 = new ThreadUsingRunnableInterface(Integer.parseInt(f.get().toString()));
            executorService.execute(t2);
        }

        executorService.shutdown();
    }

}


class ThreadUsingThreadClass extends Thread{

    int count;
    ThreadUsingThreadClass(int count){
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() );
    }
}

class ThreadUsingRunnableInterface implements Runnable{

    int count;
    ThreadUsingRunnableInterface(int count){
        this.count = count;
    }

    public void run() {
        for (int i =0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() );
        }
    }
}

class ThreadUsingCallableInterface implements Callable{

    int count;
    public Integer call() {
        System.out.println("======= callable =======");
        for (int i=0;i<5;i++){
            count++;
        }
        return count;
    }
}

