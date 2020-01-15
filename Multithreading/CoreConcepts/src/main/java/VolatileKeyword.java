import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// Volatile make sure data will be  read / write from main memory directly not from CPU cache.

public class VolatileKeyword {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        VolatileData volatileData = new VolatileData();

        for (int i=0;i<10;i++){
            VolatileTestThread volatileTestThread = new VolatileTestThread(volatileData);
            executorService.execute(volatileTestThread);
        }

        executorService.shutdown();
    }

}

class VolatileData{
    private volatile int counter =0 ;

    public int getCounter() {
        return counter;
    }

    public void increaseCounter(){
        counter++;
    }
}


class VolatileTestThread  implements Runnable{

    VolatileData volatileData ;

    VolatileTestThread(VolatileData volatileData){
        this.volatileData = volatileData;
    }

    public void run() {
        volatileData.increaseCounter();
        System.out.println(Thread.currentThread().getName() + " counter : "
                + volatileData.getCounter());
    }
}

