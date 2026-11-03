package Urok17Practiks;

public class Task21 {
    public static void main(String[] args) {
        String correctPassword = "Java2026";
        String enteredPassword = "java2026";
        System.out.println(correctPassword.equals(enteredPassword));
        System.out.println(correctPassword.equalsIgnoreCase(enteredPassword));
    }
}