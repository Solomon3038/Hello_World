package loops;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {

        ArrayList< String > celebrities = new ArrayList < String > ();

        celebrities.add("Tom Cruise");
        celebrities.add("Will Smith");
        celebrities.add("Jackie Chan");
        celebrities.add("Akshay Kumar");

        ListIterator< String > listIterator = celebrities.listIterator();

        System.out.println("Forward direction:- ");

        for (;listIterator.hasNext();) {  //
            System.out.println(listIterator.next());
        }

    }
}
