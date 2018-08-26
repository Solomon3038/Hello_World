package loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteraTor {
    public static void main(String[] args)
    {
       /* ArrayList alv = new ArrayList();

        for (int i = 0; i < 10; i++)
            alv.add(i);

        System.out.println(alv);

        // at beginning itr(cursor) will point to
        // index just before the first element in al

        Iterator itr = alv.iterator();

        // checking the next element availabilty
        while (itr.hasNext())
        {
            //  moving cursor to next element
            int i = (Integer)itr.next();

            // getting even elements one by one
            System.out.print(i + " ");

            // Removing odd elements
            if (i % 2 != 0)
                itr.remove();
        }
        System.out.println();
        System.out.println(alv);*/

        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++)
            al.add(i);

        System.out.println(al);

        // at beginning ltr(cursor) will point to
        // index just before the first element in al
        ListIterator ltr = al.listIterator();

        // checking the next element availabilty
        while (ltr.hasNext())
        {
            //  moving cursor to next element
            int i = (Integer)ltr.next();

            // getting even elements one by one
            System.out.print(i + " ");

            // Changing even numbers to odd and
            // adding modified number again in
            // iterator
            if (i%2==0)
            {
                i++;  // Change to odd
                ltr.set(i);  // set method to change value
                ltr.add(i);  // to add
            }
        }
        System.out.println();
        System.out.println(al);
    }
}
