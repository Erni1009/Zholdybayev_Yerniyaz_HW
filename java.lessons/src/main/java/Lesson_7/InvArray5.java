package Lesson_7;

import java.util.Arrays;

public class InvArray5 {
    public static void main(String[] args) {
        invertArray();

    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b");
    }
}





