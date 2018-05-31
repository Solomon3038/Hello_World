package button.direktory6;


    import java.io.*;
import java.util.zip.*;

    public class zipApp {

        public static void main(String[] args) {

            try(ZipInputStream zin = new ZipInputStream(new FileInputStream("/home/solomon/Рабочий стол/wowan.zip")))
            {
                ZipEntry entry;
                String name;
                long size;
                while((entry=zin.getNextEntry())!=null){

                    name = entry.getName(); // получим название файла
                    size=entry.getSize();  // получим его размер в байтах
                    System.out.printf("Название: %s \t размер: %d \n", name, size);
                }
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }
        }
    }


