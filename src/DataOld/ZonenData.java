package DataOld;

import java.time.Clock;

public class ZonenData {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
    }

}
