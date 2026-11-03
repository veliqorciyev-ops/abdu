package Urok17Practiks;

public class Task15 {
    public static void main(String[] args) {
        String firstName = " ALEX ";
        String lastName = " SMITH ";
        String email = firstName.trim().toLowerCase()
                + "." + lastName.trim().toLowerCase()
                + "@school.com";
        System.out.println(email);
    }
}