package loops;

public class LastString {


    public static void main(String[] args) {


        String lastString = null;

        for (String s : new String[]{"a", "b", "4"}) {
            // Do something.


            // Keep the reference to the current object being iterated on.
            lastString = s; // rabotaet v cicle forech i tolko s poslednem elementom
        }

        System.out.println(lastString);



    }
}
