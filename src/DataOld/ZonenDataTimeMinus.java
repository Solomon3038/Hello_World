package DataOld;

import java.time.Period;
import java.time.ZonedDateTime;

public class ZonenDataTimeMinus {

        public static void main(String[] args) {
            ZonedDateTime zone= ZonedDateTime.now();
            ZonedDateTime m = zone.minus(Period.ofDays(126));
            System.out.println(m);
        }

}
