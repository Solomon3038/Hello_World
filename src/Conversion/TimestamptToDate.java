package Conversion;


import java.sql.Timestamp;
import java.util.Date;

public class TimestamptToDate {

        public static void main(String args[]){
            Timestamp ts=new Timestamp(System.currentTimeMillis());
            Date date=new Date(ts.getTime());
            Date date1 = new Date();
            System.out.println(date);
            System.out.println(date1);
        }
    }
