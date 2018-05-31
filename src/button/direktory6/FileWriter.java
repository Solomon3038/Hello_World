package button.direktory6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("/home/solomon/Рабочий стол/hello.txt")))
        {
            // чтение построчно
            String text;
            while(!(text=br.readLine()).equals("ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

