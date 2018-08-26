package comparable;

import java.util.Comparator;

class PersonComparator implements Comparator<Person1>{

    public int compare(Person1 a, Person1 b){

        return a.getName().compareTo(b.getName());
    }
}