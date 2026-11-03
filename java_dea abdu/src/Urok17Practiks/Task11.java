package Urok17Practiks;

public class Task11 {
    public static void main(String[] args) {
        String items = "diamond,sword,apple,shield";
        String[] parts = items.split(",");
        for (String item : parts) {
            System.out.println(item);
        }
        items = items.replace("apple", "golden_apple");
        System.out.println(items);
    }
}