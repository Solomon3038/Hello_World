package loops;

import java.util.ArrayList;
import java.util.List;

public class OldOfArrayList {

    private static List squares = new ArrayList();

    private static void fillList() {
        for (int i = 0; i < 6; i++) {
            squares.add(i * i);
        }
    }

    private static void outputList() {
        for (int i = 0; i < squares.size(); i++) {
            System.out.printf("%d squared is %d.\n",i, squares.get(i));
        }
    }

    public static void main(String args[]) {
        fillList();
        outputList();




    }
}

