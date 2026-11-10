package RegexPractiks;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task8 {
    public static void main(String[] args) {
        String text = "ID=789;";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }
}