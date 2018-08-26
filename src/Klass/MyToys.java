package Klass;

public class MyToys {
    int number;
    static int numbers = 0;
    String name ;



public void setname (String s){
    name = s;
    s =" ";
}


public static void number (MyToys m){
    m.number =numbers;

}

    @Override
    public String toString() {
        return
                 name ;
    }

    public static void main (String [] args){
    String s = "Car";

    MyToys myToys = new MyToys();
    myToys.setname(s);

     System.out.println(myToys);

 }
}
