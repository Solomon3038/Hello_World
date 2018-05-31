package button.inkrement;

 public class preinkriment {
    public static void main(String[] args) {
        /**int a = 8;
    int b = ++a;
System.out.println(a);  // 9
System.out.println(b);  // 9
*/

        /**int a = 8;
        int b = a++;
        System.out.println(a);  // 9
        System.out.println(b);  // 8
       */

        System.out.println(abc(-17));

        }


     private static int abc (int value ) {

         int abc;
         abc = value < 0 ? -value : value; // ternarnyj operator <vyrazhenie1>? <vyrazhenie2> : <vyrazhenie3> esli vyrazhenie 1 to vozwrat vyrazhenie 2 esli net to vyrazhenie 3

         return abc;
          }
 }
