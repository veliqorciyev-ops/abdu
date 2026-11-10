package RegexPractiks;

public class Task17 {
    public static void main(String[] args) {
        String chat = " Alex123    says456   HELLO789  ";
        String result = chat.replaceAll("\\d", "");
        result = result.replaceAll("\\s+", " ");
        result = result.trim();
        System.out.println(result);
        System.out.println(chat);
    }
}