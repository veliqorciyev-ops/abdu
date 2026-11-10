package RegexPractiks;

public class Task2 {
    public static void main(String[] args) {
        String[] pins = {"0524", "123", "12345", "AB24"};
        for (String pin : pins) {
            System.out.println(pin.matches("\\d{4}"));
        }
    }
}
