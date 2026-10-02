package urok8Loops2;

public class NumberFilter {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 22) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Loop completed");
    }
}
