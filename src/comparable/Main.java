package comparable;

import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {


        PersonComparator pcomp = new PersonComparator();//pri pomoshi PersonComparator Comparator
        TreeSet<Person1> people = new TreeSet<Person1>(pcomp);
        people.add(new Person1("Tom"));
        people.add(new Person1("Nick"));
        people.add(new Person1("Alice"));
        people.add(new Person1("Bill"));
        for (Person1 p : people) {
            System.out.println(p.getName());
        }

       /* TreeSet<Person> people = new TreeSet<Person>();   // pri pomochi Person implements Comparable
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        people.add(new Person("Alice"));
        people.add(new Person("Bill"));
        for (Person p : people) {

            System.out.println(p.getName());
        }*/
    }
}
