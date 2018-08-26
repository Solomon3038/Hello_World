package Binding;

public class Main {

        public static void main(String[] args) {

            // Пример статического и динамического связывания в Java
            Insurance current = new CarInsurance();

            // Динамическое связывание на основе объекта
            int premium = current.premium();

            // Статическое связывание на основе класса
            String category = current.category();

            System.out.println("premium : " + premium);
            System.out.println("category : " + category);
        }
    }

    class Insurance{
        public static final int LOW = 100;

        public static int premium(){
            return LOW;
        }

        public String category(){
            return "Insurance";
        }

    }

    class CarInsurance extends Insurance{
        public static final int HIGH = 200;

        public static int premium(){
            return HIGH;
        }
        public String category(){
            return "Insurance";
        }

    }

