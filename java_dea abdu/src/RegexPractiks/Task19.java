package RegexPractiks;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task19 {
    public static void main(String[] args) {
        String text = "end and end";
        Pattern pattern1 = Pattern.compile("e.+d");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        Pattern pattern2 = Pattern.compile("e.+?d");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}
