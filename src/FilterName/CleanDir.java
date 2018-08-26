package FilterName;

import java.io.File;

public class CleanDir {


    public static void main(String[] args) {

        String folder = "/home/solomon/Рабочий стол/delet";
        cleandir(new File (folder));
    }

        protected static void cleandir (File dir){
            if (dir.exists()) {
                File[] files = dir.listFiles();// massiv failov
                for (File file : files) {
                    if (!file.isDirectory()) {
                        file.delete();
                    }
                }
            }
        }
    }
