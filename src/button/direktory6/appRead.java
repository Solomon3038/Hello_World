package button.direktory6;

import java.io.*;
import java.util.ArrayList;

public class appRead {




        public static void main(String[] args) {

            String filename = "/home/solomon/Рабочий стол/hello.txt";
            // создадим список объектов, которые будем записывать
            ArrayList<Person> people = new ArrayList();
            people.add(new Person("Том", 30, 175, false));
            people.add(new Person("Джон", 33, 178, true));

            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
            {
                oos.writeObject(people);
                System.out.println("Запись произведена");
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }

            // десериализация в новый список
            ArrayList<Person> newPeople = new ArrayList<Person>();
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
            {
                newPeople=(ArrayList<Person>)ois.readObject();
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }

            for(Person p : newPeople)
                System.out.printf("Имя: %s \t Возраст: %d \n", p.name, p.age);
        }
    }

class Person implements Serializable {

    public String name;
    public int age;
    public double height;
    public boolean married;

    Person(String n, int a, double h, boolean m){

        this.name=n;
        this.age=a;
        this.height=h;
        this.married=m;
    }
}

