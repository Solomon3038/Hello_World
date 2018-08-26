package FilterName;

import java.io.File;


public class FileFilterExample {


        public static void main(String[] args) {

            File dir = new File("/home/solomon/Рабочий стол/delet");

            File[] txtFiles = dir.listFiles(new TxtFileFilter());

            for (File txtFile : txtFiles) {
                System.out.println(txtFile.getAbsolutePath());
            }
        }


    }
