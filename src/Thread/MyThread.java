package Thread;

public class MyThread implements Runnable {

    @Override
    /*public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1; // счетчик циклов
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " has been interrupted");
                System.out.println(Thread.currentThread().isInterrupted());    // false
                Thread.currentThread().interrupt();    // повторно сбрасываем состояние
            }
        }
        System.out.printf("%s started... \n", Thread.currentThread().getName());
    }*/
    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        try{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Loop " + counter++);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " has been interrupted");
        }

        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}


    class Program {

        public static void main(String[] args) {

            System.out.println("Main thread started...");
            MyThread myThread = new MyThread();
            Thread t = new Thread(myThread, "MyThread");
            t.start();
            try {
                Thread.sleep(150);
                t.interrupt();

                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
            System.out.println("Main thread finished...");
        }
    }


