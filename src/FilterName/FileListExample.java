package FilterName;

import java.io.File;

public class FileListExample {
    public static void main(String[] args) {


        // составляется список всех файлов и подпапок в непосредственной папке
        System.out.println("File[] listFiles():\n");

        File dir = new File("/home/solomon/Рабочий стол/");

        File[] children = dir.listFiles();

        for (File file : children) {
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("\n-----------------------");

        System.out.println("String[] list():\n");

        String[] paths = dir.list();

        for (String path : paths) {
            System.out.println(path);
        }
    }

}
