package button.direktory6;

import java.io.File;
import java.io.IOException;

public class creatFile {

    public static void main(String[] args) {

        // определяем объект для каталога
        File myFile = new File("/home/solomon/Рабочий стол/hello.txt");
        System.out.println("Имя файла: " + myFile.getName());
        System.out.println("Родительский каталог: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("Файл существует");
        else
            System.out.println("Файл еще не создан");

        System.out.println("Размер файла: " + myFile.length());
        if(myFile.canRead())
            System.out.println("Файл доступен для чтения");
        else
            System.out.println("Файл не доступен для чтения");

        if(myFile.canWrite())
            System.out.println("Файл доступен для записи");
        else
            System.out.println("Файл не доступен для записи");

        // создадим новый файл
        File newFile = new File("/home/solomon/Рабочий стол/hol.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}


