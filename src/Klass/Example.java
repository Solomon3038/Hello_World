package Klass;

public class Example {
    public void Hello (){
        System.out.println("Hello");
    }
    public void Hello (String name){

        System.out.println("Hello, " +name);
    }
public static void main (String [] args){
        Example e = new Example();
        e.Hello();
        e.Hello("Akkuratov");
}
}
