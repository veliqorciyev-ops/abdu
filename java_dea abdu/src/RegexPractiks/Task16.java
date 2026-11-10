package RegexPractiks;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task16 {
    public static void main(String[] args) {
        String text = "AB-123 XY-456 ERROR CD-789";

        Pattern pattern = Pattern.compile("[A-Z]{2}-\\d{3}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }
}