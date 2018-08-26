package Thread;

public class Multi3Thread implements Runnable{



   public static void main(String args[]){
       Multi3Thread m1=new Multi3Thread();
        Thread t1=new Thread(m1);
        t1.start();
        }

    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}