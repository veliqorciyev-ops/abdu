package Urok17Practiks;

public class Task20 {
    public static void main(String[] args) {
        String message = " Hello Steve welcome to Minecraft ";
        message = message.trim();
        System.out.println(message.length());
        String[] words = message.split(" ");
        System.out.println(words.length);
        System.out.println(words[0]);
        System.out.println(words[words.length - 1]);
        message = message.replace("Steve", "Alex");
        System.out.println(message);
    }
}
