package Jvm;

public class MySharedObject {
    public static final MySharedObject object3 = new MySharedObject();

    //member variables pointing to two objects on the heap
    public Integer object2 = new Integer(22);
    public Integer object4 = new Integer(44);
}
