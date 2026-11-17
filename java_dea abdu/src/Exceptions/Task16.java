package Exceptions;

public class Task16 {
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age!");
        }
    }
    public static void main(String[] args) {
        int age = -10;

        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
