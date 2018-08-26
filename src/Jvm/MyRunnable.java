package Jvm;

public class MyRunnable  implements Runnable{
    public void run() {
        methodOne();
    }

    public void methodOne() {
        int localVariable1 = 45;
        System.out.println("45");
        MySharedObject localVariable2 = MySharedObject.object3;

        methodTwo();
    }

    public void methodTwo() {
        Integer localVariable1 = new Integer(99);
        System.out.println("99");
    }
}
