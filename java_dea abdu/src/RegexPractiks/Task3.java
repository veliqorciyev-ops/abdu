package RegexPractiks;

public class Task3 {
    public static void main(String[] args) {
        String[] letters = {"G", "g", "GG", "5"};
        for (String letter : letters) {
            System.out.println(letter.matches("[A-Z]"));
        }
    }
}
