package Exceptions;

public class Task14 {
    public static void registerPlayer(String username, int age) {
        if (username.length() < 5) {
            throw new IllegalArgumentException("Username is too short!");
        }
        if (age < 13) {
            throw new IllegalArgumentException("Age must be at least 13!");
        }
        System.out.println("Registration successful!");
    }
    public static void main(String[] args) {
        String username = "Alex";
        int age = 12;
        try {
            registerPlayer(username, age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
