package RegexPractiks;

public class Task13 {
    public static void main(String[] args) {
        String games = "Minecraft, Roblox;Fortnite, CS2";
        String[] parts = games.split("[,;]\\s*");
        for (String game : parts) {
            System.out.println(game);
        }
    }
}
