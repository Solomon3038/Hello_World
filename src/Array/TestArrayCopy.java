package Array;

public class TestArrayCopy {

        public static void main(String[] args) {
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd' };
            char[] copyTo = new char[7];

            System.arraycopy(copyFrom, 2, copyTo, 0, 7); // from s kakogo mesta v massive nachat kopiravat
            System.out.println(new String(copyTo));
        }
    }
