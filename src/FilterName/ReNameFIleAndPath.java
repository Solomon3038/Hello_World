package FilterName;

import java.io.File;

//Переименование и измение пути родителя, подобно действию " Cut" файла или папки в другую папку, а затем переименовать ее.

public class ReNameFIleAndPath {


//Переименование включая путь родителя

        public static void main(String[] args) {



            // Исходный файл (Source file).
            File srcFile = new File("/home/solomon/Рабочий стол/delet/wwww");

            // Файл назначения (Destination file).
            File destFile = new File("/home/solomon/Рабочий стол/spring/hous");

            if (!srcFile.exists()) {
                System.out.println("Src File doest not exists");
                return;
            }

            // Создать родительскую папку файла назначения.
            destFile.getParentFile().mkdirs();

            boolean renamed = srcFile.renameTo(destFile);

            System.out.println("Renamed: " + renamed);

        }

    }


