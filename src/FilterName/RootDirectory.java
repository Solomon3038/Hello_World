package FilterName;

import java.io.File;


//список всех корневых каталогов: v sisteme
public class RootDirectory {



        public static void main(String[] args) {


            File[] roots = File.listRoots();

            for(File root: roots)  {
                System.out.println(root.getAbsolutePath());
            }

        }

    }

