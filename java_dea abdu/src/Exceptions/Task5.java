package Exceptions;

public class Task5 {
    public static void main(String[] args) {
        int coins = 50;
        int players = 0;
        try {
            int result=coins/players;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide coins!");
        }
        System.out.println("Game contiunes");
    }
}
