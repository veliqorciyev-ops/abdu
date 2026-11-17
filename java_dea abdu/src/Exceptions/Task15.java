package Exceptions;

public class Task15 {
    public static void main(String[] args) {
        String input = "abc";
        int[] levels = {1, 2, 3, 4, 5};
        try {
            int index = Integer.parseInt(input);
            System.out.println(levels[index]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input!");
        }
    }
}
