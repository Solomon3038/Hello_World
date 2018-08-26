package comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class MainPersonComparator {

    public static void main (String [] args){
        Comparator<Person2> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person2> people = new TreeSet(pcomp);
        people.add(new Person2("Tom", 23));
        people.add(new Person2("Nick",34));
        people.add(new Person2("Tom",10));
        people.add(new Person2("Bill",14));

        for(Person2  p : people){

            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
