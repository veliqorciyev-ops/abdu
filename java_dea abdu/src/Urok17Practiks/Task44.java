package Urok17Practiks;

public class Task44 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10) + 1;
        int guess = 7;
        System.out.println(number);
        if (guess == number) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}
