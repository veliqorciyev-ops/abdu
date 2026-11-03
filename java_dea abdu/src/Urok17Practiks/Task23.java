package Urok17Practiks;

public class Task23 {
    public static void main(String[] args) {
        String text = "   Java---Programming---Course   ";
        text = text.trim();
        text = text.replace("---", " ");
        text = text.toUpperCase();
        System.out.println(text);
    }
}