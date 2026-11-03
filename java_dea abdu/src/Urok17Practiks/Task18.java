package Urok17Practiks;

public class Task18 {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        int result = word1.compareTo(word2);
        System.out.println(result);
        if (result < 0) {
            System.out.println("apple comes before banana");
        } else if (result > 0) {
            System.out.println("apple comes after banana");
        } else {
            System.out.println("Words are equal");
        }
    }
}
