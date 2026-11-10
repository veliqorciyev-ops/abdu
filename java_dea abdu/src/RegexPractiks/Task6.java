package RegexPractiks;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task6 {
    public static void main(String[] args) {
        String text = "Level 250 unlocked";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group());}
    }
}