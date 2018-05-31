package button.direktory6;




import java.io.*;

public class filesApp {

    public static void main(String[] args) {

        Person tom = new Person("Tom", 35, 1.75, true);
        // запись в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("/home/solomon/Рабочий стол/hello.txt"))) {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try (DataInputStream dos = new DataInputStream(new FileInputStream("/home/solomon/Рабочий стол/hello.txt"))) {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Человека зовут: %s , его возраст: %d , его рост: %f метров, женат/замужем: %b",
                    name, age, height, married);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        class Person implements Serializable {

            public String name;
            public int age;
            public double height;
            public boolean married;

            Person(String n, int a, double h, boolean m) {

                this.name = n;
                this.age = a;
                this.height = h;
                this.married = m;
            }
        }
    }
}





