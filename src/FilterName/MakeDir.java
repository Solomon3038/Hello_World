package FilterName;

import java.io.File;

public class MakeDir {


        public static void main(String[] args) {

           /* File dir1 = new File("/home/solomon/Рабочий стол/delet/wowa");

            System.out.println("Pathname: " + dir1.getAbsolutePath());
            System.out.println("Path Exists? " + dir1.exists());
            System.out.println("Parent Path Exists? " + dir1.getParentFile().exists());

            // С mkdir(), папка может быть создана только если существует родительская папка.
            boolean created = dir1.mkdir();

            System.out.println("Directory created? " + created);

            System.out.println("--------------------");
*/

//папка должно существовать в которой будет создаваться под папка и в этой подпаке папка тоесть предпоследния папка не обезательна

            File dir2 = new File("/home/solomon/Рабочий стол/delet/wowa/ww/we/tt");

            System.out.println("Pathname: " + dir2.getAbsolutePath());
            System.out.println("Exists? " + dir2.exists());
            System.out.println("Parent Path Exists? " + dir2.getParentFile().exists());

            //
            boolean created = dir2.mkdirs();

            System.out.println("Directory created? " + created);
        }

    }

