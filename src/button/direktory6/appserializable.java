package button.direktory6;


import button.direktory6.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class appserializable {

    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/solomon/Рабочий стол/hello.txt")))
        {
            Person p = new Person("Джон", 33, 178, true);
            oos.writeObject(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

