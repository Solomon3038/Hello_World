package button.direktory6;

import java.io.FileWriter;
import java.io.IOException;

public class filesAp {
public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("/home/solomon/Рабочий стол/hello.txt", false))
        {
        // запись всей строки
        String text = "Мама мыла раму, раму мыла мама";
        writer.write(text);
        // запись по символам
        writer.append('\n');
        writer.append('E');

        writer.flush();
        }
        catch(IOException ex){

        System.out.println(ex.getMessage());
        }
        }
        }