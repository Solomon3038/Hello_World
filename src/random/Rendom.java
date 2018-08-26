package random;

import java.util.Random;

public class Rendom {
    public static void main (String[] args){
        /*Random r= new Random();
        byte [] arr = new byte [100];
        r.nextBytes(arr);
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }*/
        Random ran = new Random();
        int [] ar =new int[3];
       //System.out.println("Nex float value:" +ran.nextBoolean());

        for (int i=0;i<ar.length; i++){
            ar[i]= ran.nextInt();System.out.println(ar[i]);
        }

    }
}
