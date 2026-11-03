package Urok17Practiks;

public class Task13 {
    public static void main(String[] args) {
        String player = "Lionel Messi";
        int space = player.indexOf(" ");
        System.out.println(player.substring(space + 1));
        System.out.println(player.startsWith("Lionel"));
        System.out.println(player.toUpperCase());
    }
}
