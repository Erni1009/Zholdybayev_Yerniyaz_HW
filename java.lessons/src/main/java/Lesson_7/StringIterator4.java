package Lesson_7;

public class StringIterator4 {
    public static void main(String[] args) {
    iter("HOORAY!",3);
    }

    public static void iter(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}