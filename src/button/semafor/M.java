package button.semafor;



import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class M {

    static long numOfOperations = 10_000_000_000L;
    static int  numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws Exception {

        /**MyTread mytreahd = new MyTread();

        mytreahd.start();
       //Thread.sleep(500);
       Thread.yield();
        //Thread.sleep();
        //mytreahd.join();
        System.out.println(Thread.currentThread().getName());

    }
}

    class MyTread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("metod run ");
            //someMetode();

        }

        private void someMetode() {
            throw new RuntimeException();
        }
        */
        /**
        System.out.println(numOfThreads);
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(new Date());
        System.out.println(pool.invoke());
         */
    }
}
