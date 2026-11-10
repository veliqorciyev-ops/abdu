package RegexPractiks;

public class Task10 {
    public static void main(String[] args) {
        String text = "Java   is    cool";
        String result = text.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
