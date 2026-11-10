package RegexPractiks;

public class Task4 {
    public static void main(String[] args) {
        String[] codes = {"AB123", "XY777", "A123", "ABC123"};

        for (String code : codes) {
            System.out.println(code.matches("[A-Z]{2}\\d{3}"));
        }
    }
}