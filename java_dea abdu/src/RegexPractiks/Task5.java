package RegexPractiks;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task5 {
    public static void main(String[] args) {
        String text = "I learn Java at Developia";
        Pattern pattern = Pattern.compile("\\bJava\\b");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find());
        Pattern pattern2 = Pattern.compile("\\bPython\\b");
        Matcher matcher2 = pattern2.matcher(text);
        System.out.println(matcher2.find());}
}
