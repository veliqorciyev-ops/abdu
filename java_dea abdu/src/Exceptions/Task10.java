package Exceptions;

public class Task10 {
    public static void main(String[] args) {
        int score = 150;
        try {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
