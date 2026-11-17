package Exceptions;

public class Task13 {
    public static int withdrawMoney(int balance, int amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Insufficient balance!");
        }
        return balance - amount;
    }
    public static void main(String[] args) {
        int balance = 500;
        int withdraw = 800;
        try {
            withdrawMoney(balance, withdraw);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
