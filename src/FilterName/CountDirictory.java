package FilterName;

import java.io.File;

//Перечисление всех подпапок

public class CountDirictory {


        private void fetchChild(File file) {

            System.out.println(file.getAbsolutePath());

            if (file.isDirectory()) {

                File[] children = file.listFiles();

                for (File child : children) {
                    // Рекурсивный (Recursive)
                    this.fetchChild(child);
                }
            }

        }




    public static void main(String[] args) {

            CountDirictory example = new CountDirictory();

            File dir = new File("/home/solomon/Рабочий стол/delet/");

            example.fetchChild(dir);

        }

    }

