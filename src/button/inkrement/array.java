import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*

public class array {


    public static void main (String[] args) {
*/
       /** ArrayList<String> str = new ArrayList<String>();
        String[] strinn = {};
        str.add("Hello World");
        str.add("Wladi");
        str.add("Sis");
        str.add("Dimi");
        str.add("kkkk");
        str.add("llll");
        str.add("eee");
        //System.out.println ("Первый элемент массива '" + str.get(3) + "'");
        //System.out.println("size the arraList" + "" + Integer.valueOf (str.size()) );
        //System.out.println("number the element" + " " + str.get(2)   );

        strinn = str.toArray(new String [str.size()]);

        //Stream.of(strinn).forEach(System.out::println);
        //Arrays.asList(strinn).stream().forEach(s -> System.out.println(s));

        for (int i = 0; i < strinn.; i++) {
            System.out.println(strinn[i]);
        }
*//**
        IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
        intStream.forEach(i->System.out.println(i));
*/
/**
        LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        longStream.forEach(l->System.out.println(l));
*/

       /**
        DoubleStream doubleStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345, 121});
        doubleStream.forEach(d->System.out.println(d));

        */


/**

        Stream<String> citiesStream =Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream.forEach(s->System.out.println(s));
*/
/*
        String[] cities = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream2 =Stream.of(cities);

        citiesStream2.forEach(s->System.out.println(s));
*/

/**
        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(d->System.out.println(d));
 */
/**
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.filter(s->s.length()==6).forEach(s->System.out.println(s));
        */
/**
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream.filter(p->p.getPrice()<50000).forEach(p->System.out.println(p.getName()));
    }*/




/**  Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s->System.out.println(s));
    }*/

       /**
        List<String> phones = new ArrayList<String>();
        phones.addAll(Arrays.asList(new String[]
                {"iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                        "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                        "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                        "Lenovo S 850"}));

        int pageSize = 3; // количество элементов на страницу
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("Введите номер страницы: ");
            int page = scanner.nextInt();

            if (page < 1) break; // если число меньше 1, выходим из цикла

            phones.stream().skip((page - 1) * pageSize)
                    .limit(pageSize)
                    .forEach(s -> System.out.println(s));
        }
    }





     class Phone {

         private String name;
         private int price;

         public Phone(String name, int price) {
             this.name = name;
             this.price = price;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public int getPrice() {
             return price;
         }

         public void setPrice(int price) {
             this.price = price;
         }
        */

/**
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x, y)->x + " " + y);
        System.out.println(sentence.get());
        */
/**
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));
 */


        /**Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
         */

        /**Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany));

        for(Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
         }
         */

        /**
        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
        }
         */
/**

            Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
                    new Phone("Pixel 2", 45000),
                    new Phone("Samsung Galaxy S9", 40000),
                    new Phone("Nokia 9", 32000)};

            Arrays.parallelSort(phones,new PhoneComparator());

            for(Phone p: phones)
                System.out.println(p.getName());
        }
        }

    class PhoneComparator implements Comparator<Phone>{

        public int compare(Phone a, Phone b){

            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }


class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String val) {
        this.name=val;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int val) {
        this.price=val;
    }
 /**/
/*
        String[] greeting = {"Hey", "there", "amigo!"};
        //String delimiter = " ";
        //String.join(delimiter, greeting);
        System.out.println(Arrays.toString(greeting));


        for (int i = 0; i < objekt.size() || i < 10; i++) {

        }
    }
}*/









