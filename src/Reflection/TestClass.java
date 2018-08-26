package Reflection;

/*
class Simple{}

class Test{
    void printName(Object obj){
        Class c=obj.getClass();
        System.out.println(c.getName());
    }
    public static void main(String args[]){
        Simple s=new Simple();

        Test t=new Test();
        t.printName(s);
    }
}
*/

/*class Simple{}*/


class Test{


    public static void main(String args[]) {
        try {
            Class c = Class.forName("Simple");
            System.out.println(c.getName());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }

    }}


