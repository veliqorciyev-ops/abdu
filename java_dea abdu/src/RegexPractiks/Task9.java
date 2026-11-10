package RegexPractiks;

public class Task9 {
    public static void main(String[] args) {
        String text = "Hello Java2026";
        String newText = text.replaceAll("\\d", "");
        System.out.println(newText);
        System.out.println(text);
    }
}
