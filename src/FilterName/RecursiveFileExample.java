package FilterName;

import java.io.File;

//Перечисление всех подпапок plus udalenie v podpapkah
public class RecursiveFileExample {



    private void fetchChild(File file) {

        System.out.println(file.getAbsolutePath());

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            for (File child : children) {
                // Рекурсивный (Recursive)
                this.fetchChild(child);
               if(!child.isDirectory())
                   child.delete();
            }
        }

    }



    public static void main(String[] args) {

        RecursiveFileExample example = new RecursiveFileExample();

        File dir = new File("/home/solomon/Рабочий стол/delet");

        example.fetchChild(dir);

    }
}
