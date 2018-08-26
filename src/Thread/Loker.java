package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class Loker {
    public static void main(String[] args) {

        CommonResource2 commonResource= new CommonResource2();
        ReentrantLock locker = new ReentrantLock(); // создаем заглушку
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread2(commonResource, locker));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResource2{

    int x=0;
}

class CountThread2 implements Runnable{

    CommonResource2 res;
    ReentrantLock locker;
    CountThread2(CommonResource2 res, ReentrantLock lock){
        this.res=res;
        locker = lock;
    }
    public void run(){

        locker.lock(); // устанавливаем блокировку
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock(); // снимаем блокировку
        }
    }
}
