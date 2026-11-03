package Urok17Practiks;

public class Task38 {
    public static void main(String[] args) {
        int x1 = 3, y1 = 4;
        int x2 = 9, y2 = 12;

        double d = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println(d);
    }
}
