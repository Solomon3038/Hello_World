package button.direktory6;

import java.io.FileReader;
import java.io.IOException;

public class filesReader {


        public static void main(String[] args) {

            try(FileReader reader = new FileReader("/home/solomon/Рабочий стол/hello.txt"))
            {
                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    System.out.print((char)c);
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }

}
