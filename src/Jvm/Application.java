package Jvm;

public class Application {
    public static void main(String[]args){

        Thread thread1 =  new Thread(new MyRunnable());
        thread1.start();

        Thread thread2 =  new Thread(new MyRunnable());
        thread2.start();
    }
}
