package Lambda;


    public class LambdaApp1 {

        public static void main(String[] args) {

            Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
            System.out.println(convert.apply(5)); // 5 долларов
        }



    }
interface Function<T, R> {
    R apply(T t);
}