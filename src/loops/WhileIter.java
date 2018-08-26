package loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileIter {

   /* while( iterator.hasNext()) {
        doSomethingWith (iterator.next());
    }*/

    private static List squares = new ArrayList();

    private static void fillList() {
        for (int i = 0; i < 6; i++) {
            squares.add(i * i);
        }
    }

    private static void outputList() {
        Iterator iterator = squares.iterator();
        int j=0;

        for (;iterator.hasNext();) {
            System.out.printf("%d squared is %d.\n",j++, iterator.next());
        }
    }

    public static void main(String args[]) {
        fillList();
        outputList();
    }
}

