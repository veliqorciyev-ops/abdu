package Exceptions;
class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
public class Task18 {
    public static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid score: " + score);
        }
        System.out.println("Score " + score + " is valid");
    }

    public static void main(String[] args) {
        int[] scores = {85, -10, 150};

        for (int score : scores) {
            try {
                validateScore(score);
            } catch (InvalidScoreException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
