package Urok17Practiks;

public class Task9 {
    public static void main(String[] args) {
        String email = "contact@home.az";
        System.out.println(email.contains("@"));
        System.out.println(email.endsWith(".az"));
        System.out.println(email.substring(0, email.indexOf("@")));
    }
}