package Binding;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
      /*  List allAnimals = new ArrayList<>();
        allAnimals.add(new Cat());
        allAnimals.add(new Wolf());
        allAnimals.add(new Fox());
        allAnimals.add(new YorkshireTerrier());

        Iterator<Animals> iterator = allAnimals.iterator();


        Animals cat2 = new Cat();
        Cat cat = new Cat();
        cat.sleepOnKeyboard();
        cat2.sleep();
        System.out.println(cat2);   //iterator.hasNext()  /Animals animals= iterator.next();


        if (inctanceof Animals){


            animals.sleep();
            animals.eat();

        }

    }*/

        final int[] array = {1, 2, 3, 4, 5};
        new Object() {
            void twice() {
                for (int i = 0; i < array.length; ++i) {
                    System.out.println(array[i] *= 2);
                }
            }
        }.twice();



    }
}
