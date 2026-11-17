package Exceptions;

public class Task19 {
    public static void main(String[] args) {
        String username = "Steve";
        String password = "123";
        int age = 12;
        try {
            if (username.length() < 5) {
                throw new IllegalArgumentException("Username is too short!");
            }
            if (password.length() < 8) {
                throw new IllegalArgumentException("Password is too short!");
            }
            if (age < 13) {
                throw new IllegalArgumentException("Age is too low!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Login validation completed!");
        }
    }
}
