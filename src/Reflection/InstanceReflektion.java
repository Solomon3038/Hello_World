package Reflection;


   /* class Simple{
        void message(){System.out.println("Hello Java");}
    }

public class InstanceReflektion {
        public static void main(String args[]){
            try{
                Class c=Class.forName("Simple");
                Simple s=(Simple)c.newInstance();
                s.message();

            }
            catch(Exception e){System.out.println(e);}

        }
    }
*/

class Foo {
    static {
        System.out.println("Foo initializing");
    }
}

public class InstanceReflektion {
    public static void main(String [] args) throws Exception {
        Class.forName("Foo");
    }
}