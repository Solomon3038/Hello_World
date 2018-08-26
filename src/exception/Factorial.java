package exception;

public class Factorial {
    public static void main(String[] args){

        try{
            int result = Program.getFactorial(0);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
