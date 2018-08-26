package propertie;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {

    /*public static void main (String[] args){
        Properties p = System.getProperties();
        Set set = p.entrySet();
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+ "="+ entry.getValue());
        }
}*/

    public static void main(String[] args)throws Exception{
       /* FileReader reader=new FileReader("data.bin");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"))*/;

        Properties p=new Properties();
        p.setProperty("name","Sonoo Jaiswal");
        p.setProperty("email","sonoojaiswal@javatpoint.com");

        p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");
        System.out.println(p);

    }


}

