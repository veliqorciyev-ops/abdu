package Urok17Practiks;

public class Task14 {
    public static void main(String[] args) {
        String text = "Java is cool. Java is powerful.";
        System.out.println(text.indexOf("Java"));
        System.out.println(text.lastIndexOf("Java"));
        text = text.replace("Java", "Python");
        System.out.println(text);
    }
}
