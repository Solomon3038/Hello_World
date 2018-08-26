package inputStream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintWriter1 {
    public static void main(String[] args) {

        try(PrintStream printStream = new PrintStream("/home/solomon/Рабочий стол/wowan"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");

            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
