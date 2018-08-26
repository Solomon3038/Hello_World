package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapp {


        public static void main (String [] args){

              Map<Integer, String> states = new HashMap<Integer, String>();
            states.put(1, "Germany");
            states.put(2, "Spain");
            states.put(4, "France");
            states.put(3, "Italy");


            String first = states.get(2);
            System.out.println(first);
            // получим весь набор ключей
            Set<Integer> keys = states.keySet();
            // получить набор всех значений
            Collection<String> values = states.values();
            //заменить элемент
            states.replace(1, "Poland");
            // удаление элемента по ключу 2
            states.remove(2);
            // перебор элементов
            for(Map.Entry<Integer,String> item : states.entrySet()){
                System.out.printf("Key: %d Value: %s  \n",item.getKey(),item.getValue());

            }
            Map<String,Person> peopel = new HashMap<String,Person>();
            peopel.put("1240i54",new Person("Tom"));
            peopel.put("1564i55",new Person("Bill"));
            peopel.put("4540i56", new Person("Nick"));
            for (Map.Entry<String,Person> item : peopel.entrySet()){
                System.out.printf("Key: %s Value: %s \n", item.getKey(),item.getValue().getName());
        }


        }

    }

    class Person {
    private String name;

    public Person (String value){
        name=value;
        }
        String getName (){return name;}
      }

