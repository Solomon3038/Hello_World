package StreamExample;




import java.util.Comparator;
import java.util.stream.Stream;

public class ApStream {

    public static void main(String[] args) {

        Stream<Phone1> phoneStream = Stream.of(new Phone1("iPhone 6 S", "Apple", 600),
                new Phone1("Lumia 950", "Microsoft", 500),
                new Phone1("LG G 5", "LG",450),
                new Phone1("ASUS Zenfone 2", "ASUS",150),
                new Phone1("Lumia 640", "Microsoft", 200));

        phoneStream.sorted(new PhoneComparator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));

    }
}
class PhoneComparator implements Comparator<Phone1>{

    public int compare(Phone1 a, Phone1 b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }

}

class Phone1{

    private String name;
    private String company;
    private int price;

    public Phone1(String name, String comp, int price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getCompany() {
        return company;
    }
}
