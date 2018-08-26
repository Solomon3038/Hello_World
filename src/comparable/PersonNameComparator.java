package comparable;

import java.util.Comparator;

class PersonNameComparator implements Comparator<Person2>{
   @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class PersonAgeComparator implements Comparator<Person2>{
@Override
    public int compare(Person2 o1, Person2 o2) {

        if(o1.getAge()> o2.getAge())
            return 1;
        else if(o1.getAge()< o2.getAge())
            return -1;
        else
            return 0;
    }
}
