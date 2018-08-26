package Recursion;

public class RecursionExample2 {

        static int n1=0,n2=1,n3=0;  // n3=1 n2=1 n1=1    n3=2 n2=2 n1=1    n3=3 n2=3 n1=2   n3=5 n1=3 n2=5  n3=8 n1=5 n2=8 n3=13 n1=8 n2=13

        static void printFibo(int count){

            if(count>0){
                n3 = n1 + n2; //1
                n1 = n2; //1
                n2 = n3;//1

                System.out.print(" "+n3);
                /*System.out.println("Hell");*/

                printFibo(count-1);
            }
        }

        public static void main(String[] args) {

            int count=13;

            System.out.print(n1+" "+n2);//printing 0 and 1

            printFibo(count-2);//n-2 because 2 numbers are already printed
        }
    }

