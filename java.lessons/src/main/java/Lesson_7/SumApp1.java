package Lesson_7;

public class SumApp1 {
    public static void main(String[] args) {

        System.out.println(sumCheck(7, 8));
    }


    public static boolean sumCheck(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;

        } else {
            return false;
        }

    }


}

