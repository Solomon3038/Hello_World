package StringExample;


    public class SplitExample2{


        public static void main(String args[]){
            String s1="welcome to split world";
            System.out.println("returning words:");
           /* for(String w:s1.split("\\s",0)){
                System.out.println(w);
            }*/
           // System.out.println("returning words:");
            for(String w:s1.split("\\s",6)){ //2 parametr chislo pokazyvaet na skolko chastej mozhno podelit masiv iz strok
                System.out.println(w);
            }
           /* System.out.println("returning words:");
            for(String w:s1.split("\\s",2)){
                System.out.println(w);
            }*/

        }}

