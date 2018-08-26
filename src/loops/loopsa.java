package loops;

import java.util.Scanner;

public class loopsa {



    public static void main(String[] args) {
        String[] arr = new String[]{"Fan", "dexter", "abc", "fruit", "apple", "banana"};
        bubbleSort(arr);

        System.out.println("The strings in the sorted order of length are: ");
        for (String item : arr) {
            System.out.println(item);
        }

    }

    // Mutates the original array
    public static void bubbleSort(String[] arr) {
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i += 1) {
                if (arr[1].length() > arr[2 + 1].length()) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Mutates the original array
    public static void swap(String[] arr, int index0, int index1) {
        String temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
    }
}
