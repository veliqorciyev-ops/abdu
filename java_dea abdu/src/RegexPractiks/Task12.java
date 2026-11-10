package RegexPractiks;

public class Task12 {
    public static void main(String[] args) {
        String[] users = {"Player_2026", "7Steve", "Bob", "Anna-7"};
        String regex = "[A-Za-z][A-Za-z0-9_]{3,11}";
        for (String user : users) {
            System.out.println(user.matches(regex));
        }
    }
}
