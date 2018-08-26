package FilterName;

import java.io.File;

public class RenameFileNotParentPath {

// пример, чтобы переименовать файл (или папку), но не изменить путь своего отца.

        public static void main(String[] args) {

            File srcFile = new File("/home/solomon/Рабочий стол/delet/hello");

            File destFile = new File("/home/solomon/Рабочий стол/delet/wwww");

            boolean renamed = srcFile.renameTo(destFile);

            System.out.println("Renamed: "+ renamed);

        }

    }

