package Reflection;

import java.lang.reflect.Method;

public class ReflectionMetode {

        public static void main(String[] args){
            Foo0 f = new Foo0();

            Method method;
            try {
                method = f.getClass().getMethod("print", new Class<?>[0]);
                method.invoke(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


