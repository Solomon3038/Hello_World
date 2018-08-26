package String;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubString {



    public static void main(String[] args) {


        String text = "/save Test #detrtm record hello #test";


      /*  String surname = text.substring(text.indexOf(" ") ,text.lastIndexOf(" #"));
        System.out.println(surname);*/



        /*for (String tmp : str.split("\\s", 0)) {
            if (!tmp.startsWith("/")) {
                String surname = tmp.substring(tmp.lastIndexOf(" ") + 1);
                System.out.println(surname);
            }


        }
*/

/*
        String content = "Java Scan";
        String surname = content.substring(content.lastIndexOf(" ") + 1);
        System.out.println("Last Word: " + surname);*/
       /* String listOfWords = "This is a sentence";
        String allButLast = listOfWords.substring(0, listOfWords.lastIndexOf(" setence"));

        System.out.println(allButLast);

 String[] b = tmp.split("\\s",0);
                String lastWord = b[b.length - 1];


        String listOfWords = "/save Test #detrtm record hello #test";

        String[] b = listOfWords.split("\\s+");

        String lastWord = b[b.length - 1];
        String rest = listOfWords.substring(0,listOfWords.indexOf(lastWord)).trim(); // Adde


        System.out.println(rest);*/


        String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";



            Pattern pattern = Pattern.compile("\\w+");
            // in case you would like to ignore case sensitivity,
            // you could use this statement:
            // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
            Matcher matche = pattern.matcher(EXAMPLE_TEST);
            // check all occurance
            while (matche.find()) {
                System.out.print("Start index: " + matche.start());
                System.out.print(" End index: " + matche.end()+ " ");
                System.out.println(matche.group());
            }
            // now create a new pattern and matcher to replace whitespace with tabs
            Pattern replace = Pattern.compile("\\s+");
            Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
            System.out.println(matcher2.replaceAll("\t"));

    }
        }


