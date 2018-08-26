package inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program3 {


        public static void main(String[] args) {

            try(FileInputStream fin=new FileInputStream("/home/solomon/Рабочий стол/hello");
                FileOutputStream fos=new FileOutputStream("/home/solomon/Рабочий стол/wowan"))
            {
                byte[] buffer = new byte[fin.available()];
                // считываем буфер
                fin.read(buffer, 0, buffer.length);
                // записываем из буфера в файл
                fos.write(buffer, 0, buffer.length);
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    }
