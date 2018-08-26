package FilterName;

import java.io.File;
import java.util.Date;

public class FilePathInfo {

    public static void main(String[] args) {

            // Создать объект File представлюящий путь.
            File apath = new File("/home/solomon/Рабочий стол/delet");

            // Проверка существования.
            System.out.println("Path exists? " + apath.exists());

            if (apath.exists()) {


                // Проверить является ли 'apath' папкой или нет?
                System.out.println("Directory? " + apath.isDirectory());

                // Проверить является ли 'apath' скрытым путем или нет?
                System.out.println("Hidden? " + apath.isHidden());

                // Простое название.
                System.out.println("Simple Name: " + apath.getName());

                // Абсолютный путь.
                System.out.println("Absolute Path: " + apath.getAbsolutePath());

                // Проверка размера файла (По единицам byte):
                System.out.println("Length (bytes): " + apath.length());

                // Последнее изменение (в милисекундах)
                long lastMofifyInMillis = apath.lastModified();
                Date lastModifyDate = new Date(lastMofifyInMillis);

                System.out.println("Last modify date: " + lastModifyDate);

            }

        }

    }


