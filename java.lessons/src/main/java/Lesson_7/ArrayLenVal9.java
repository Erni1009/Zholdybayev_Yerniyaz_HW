package Lesson_7;

public class ArrayLenVal9 {
    public static void main(String[] args) {
        arrOutput();
    }
    public static int [] array2 (int len, int initialValue) {
        int [] arr2 = new int[len];
        for (int i = 0; i<len; i++){
            arr2[i] = initialValue;
        }
        return arr2;


    }
    public static void arrOutput (){
        int[] arr4 = array2(2,3);
        for (int num: arr4){
            System.out.println(num + " "  );
        }
    }

}
