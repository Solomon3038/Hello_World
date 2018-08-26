package loops;

import java.util.Arrays;





public class ArraySort {

    public static void main (String [] args){

    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr);  //sortiruet po porjadku

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
/*
        int answer = 42;
        String text = String.format("The answer is %s", answer); //%s string zeichen
        System.out.println(text);*/

/*%s für String,
%f für Gleitkommazahlen,
%d für Integer und
%n für Zeilenumbruch statt \n*/
    }
}
