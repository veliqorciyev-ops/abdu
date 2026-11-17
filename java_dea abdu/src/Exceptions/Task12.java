package Exceptions;

public class Task12 {
    public static void checkPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must contain at least 8 characters!");
        }
    }
    public static void main(String[] args) {
        String password = "abc";
        try {
            checkPassword(password);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
