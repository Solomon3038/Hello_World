package exception;

public class except {
    public static void main (String[] args){
        int a = 4;

        try {
            System.out.println(a/0);
        } catch(Exception ex)
        {
            System.out.println("Fehlermeldung ");
        }


    }
}
