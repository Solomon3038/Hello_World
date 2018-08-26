package Conversion;

public class ObjectToStringPolindrom {

        public static void main(String args[]){
            String s="nitin";
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            String rev=sb.toString();//converting StringBuilder to String
            if(s.equals(rev)){
                System.out.println("Palindrome String"+" "+s);
            }else{
                System.out.println("Not Palindrome String");
            }
        }}
