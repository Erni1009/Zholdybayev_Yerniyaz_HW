package Lesson_7;

public class FillArr6 {
    public static void main(String[] args) {
        fillArr();
    }
    public static void fillArr (){
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ (i+1) + ", ");
        }
        System.out.println("\b\b");
    }
}
