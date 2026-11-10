package RegexPractiks;

public class Task11 {
    public static void main(String[] args) {
        String[] names = {"Rafik Salimov", "rafik Salimov", "Rafik  Salimov", "R Salimov"};
        String regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+";
        for (String name : names) {
            System.out.println(name.matches(regex));
        }
    }
}