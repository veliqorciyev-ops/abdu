package Urok17Practiks;

public class Task12 {
    public static void main(String[] args) {
        String command = "/teleport Steve 100 200";
        String[] parts = command.split(" ");

        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
    }
}
