package Lesson_7;

public class LeapYearWhen4 {
        public static void main(String args[]) {
            System.out.println(leapYear(1800));
        }
        public static boolean leapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            return true;
        }   else {
            return false;
        }
    }
}




