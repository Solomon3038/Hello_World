package button.direktory6;

import java.io.File;

public class creatDirektory {




        public static void main(String[] args) {

            // определяем объект для каталога
            File dir = new File("/home/solomon/Рабочий стол/stol");
            boolean created = dir.mkdir();
            if(created)
                System.out.println("Каталог успешно создан");
            // переименуем каталог
            File newDir = new File("/home/solomon/Рабочий стол/stol22");
            dir.renameTo(newDir);
            boolean deleted = newDir.delete();
            if(deleted)
                System.out.println("Каталог удален");
        }
}


