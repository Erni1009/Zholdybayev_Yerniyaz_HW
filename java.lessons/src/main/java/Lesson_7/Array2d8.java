package Lesson_7;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Array2d8 {
    public static void main(String[] args) {
        fillDiagonal();
    }
    public static void fillDiagonal() {
        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]) + " ");
        }
    }
}








