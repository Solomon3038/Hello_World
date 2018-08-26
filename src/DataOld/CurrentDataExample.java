package DataOld;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CurrentDataExample {

        public static void main(String[] args) {
           /* SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date));

            System.out.println(java.time.LocalDate.now());
            System.out.println(java.time.LocalTime.now());



            long millis=System.currentTimeMillis();
            java.sql.Date date4=new java.sql.Date(millis);
            System.out.println(date);*/


            Date d = new Date();
          //  System.out.println(d);

            Calendar c = new GregorianCalendar(2013, 11, 25);//календарь на 25.11.2013
            System.out.println(c.get(Calendar.MONTH));//11
            System.out.println(c.get(Calendar.YEAR));//2013
            System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//4
            System.out.println(c.get(Calendar.DAY_OF_WEEK));//4
            System.out.println(c.get(Calendar.DAY_OF_YEAR));//359
            System.out.println(c.get(Calendar.DAY_OF_MONTH));//25
         /*   SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
            SimpleDateFormat format2 = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
            System.out.println(format1.format(d)); //25.02.2013 09:03
            System.out.println(format2.format(d)); //День 25 Месяц 02 Год 2013 Время 09:03*/
        }
    }
