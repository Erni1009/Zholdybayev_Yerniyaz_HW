package Lesson_7;

public class ArrayCond7 {
    public static void main(String[] args) {
    lessThan6();
    }
    public static void lessThan6 (){
        int[] arr6 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr6.length; i++){
            if (arr6[i] < 6) {
                System.out.print(arr6[i] * 2 + " ");
            }
            else {
                System.out.print(arr6[i] + " ");
            }
        }
    }
}
