package String;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Concat {




    public static void main(String args[]) throws IOException {
      /*  String javaHub = "habrhabr".concat(".ru").concat("/hub").concat("/java");

        System.out.println(javaHub);*/

        String hello = "Hello";
        String habr = "habrahabr";
        String delimiter = ", ";

        System.out.println(String.join(delimiter, hello, habr));
// или так
        System.out.println(String.join(delimiter, new ArrayList<CharSequence>(Arrays.asList(hello, habr))));
    }
}
