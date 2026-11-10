package RegexPractiks;

public class Task1 {
    public static void main(String[] args) {
        String input = "50731";
        String regex = "[0-9]+";
        System.out.println(input.matches(regex));
        System.out.println("50A31".matches(regex));
        System.out.println("".matches(regex));
    }
}