package Urok17Practiks;

public class Task34 {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int dice3 = (int) (Math.random() * 6) + 1;

        int sum = dice1 + dice2 + dice3;

        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(dice3);
        System.out.println(sum);
    }
}
