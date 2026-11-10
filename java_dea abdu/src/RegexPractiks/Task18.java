package RegexPractiks;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task18 {
    public static void main(String[] args) {
        String data = "Alex-15;Steve-17;Bob-13";
        Pattern pattern = Pattern.compile("([A-Za-z]+)-(\\d{2})");
        Matcher matcher = pattern.matcher(data);
        int total = 0;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            total++;
        }
        System.out.println("Total: " + total);
    }
}