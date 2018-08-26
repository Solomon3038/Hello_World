package statik;

public class Test {
    public static void main (String[] args){
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint();
        MyPoint.x = 1;
        System.out.println(MyPoint.x);//1
        System.out.println(point1.x);//1
        System.out.println(point2.x);//1
        point1.x = 2;
        System.out.println(MyPoint.x);//2
        System.out.println(point1.x);//2
        System.out.println(point2.x);//2
    }
}
