package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ProgramListIterator {
    public static void main(String[] args){
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");



        ListIterator<String> iterator = states.listIterator();



        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.set("Portugal");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
