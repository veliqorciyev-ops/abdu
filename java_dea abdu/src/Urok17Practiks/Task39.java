package Urok17Practiks;

public class Task39 {
    public static void main(String[] args) {
        int health1 = (int) (Math.random() * 101) + 50;
        int health2 = (int) (Math.random() * 101) + 50;
        System.out.println(health1);
        System.out.println(health2);
        System.out.println(Math.max(health1, health2));
    }
}