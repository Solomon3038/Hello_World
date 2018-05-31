package button.direktory6;

import java.io.File;

public class searchFile {


        public static void main(String[] args) {

            // определяем объект для каталога
            File dir = new File("/home/solomon/Рабочий стол/nastroiki");
            // если объект представляет каталог
            if(dir.isDirectory())
            {
                // получаем все вложенные объекты в каталоге
                for(File item : dir.listFiles()){

                    if(item.isDirectory()){

                        System.out.println(item.getName() + "  \tкаталог");
                    }
                    else{

                        System.out.println(item.getName() + "\tфайл");
                    }
                }
            }
        }
    }

