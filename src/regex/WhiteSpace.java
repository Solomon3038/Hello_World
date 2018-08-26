package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteSpace {


    public static void main(String[] args) {


        /*String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";


        Pattern pattern = Pattern.compile("\\w+");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matche = pattern.matcher(EXAMPLE_TEST);
        // check all occurance
        while (matche.find()) {
            System.out.print("Start index: " + matche.start());
            System.out.print(" End index: " + matche.end() + " ");
            System.out.println(matche.group());
        }
        // now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t"));*/

       /* Pattern p = Pattern.compile("(якороль).+(\\1)");
        Matcher m = p.matcher("регулярные выражения это круто регулярные выражения это круто регулярные выражения это круто якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные выражения это круто" );
        if(m.find()){
            System.out.println(m.group());
        }*/

        int a = 3, b = 2;
        System.out.print(a + b);

    }
}