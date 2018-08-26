package inputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStream1 {
    public static void main(String[] args) {

        String text = "Привет мир!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("/home/solomon/Рабочий стол/wowan");
            PrintStream printStream = new PrintStream(fos))
        {
            printStream.println(text);
            System.out.println("Запись в файл произведена");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
