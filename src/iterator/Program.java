package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    public static void main (String [] args){
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        Iterator<String> iterator = states.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
