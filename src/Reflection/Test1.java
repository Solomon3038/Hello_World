package Reflection;

/*
class Simple{}
    interface My{}

class Test1{
    public static void main(String args[]){
        try{
            Class c=Class.forName("Simple");
            System.out.println(c.isInterface());

            Class c2=Class.forName("My");
            System.out.println(c2.isInterface());

        }catch(Exception e){System.out.println(e);}

    }
}
*/
/*
class Test1{
    public static void main(String args[]){
        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = Test.class;
        System.out.println(c2.getName());
    }
}*/

/*class Simple{}*/
interface My{}

class Test1{
    public static void main(String args[]){
        try{
            Class c=Class.forName("Simple");
            System.out.println(c.isInterface());

            Class c2=Class.forName("My");
            System.out.println(c2.isInterface());

        }catch(Exception e){System.out.println(e);}

    }
}