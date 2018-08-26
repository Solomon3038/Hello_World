package DataOld;

import java.time.OffsetDateTime;

public class DayOfWeek {

        public static void main(String[] args) {
            OffsetDateTime offsetDT = OffsetDateTime.now();
            System.out.println(offsetDT.getDayOfWeek());
        }
    }

