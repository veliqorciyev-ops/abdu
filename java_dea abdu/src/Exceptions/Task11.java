package Exceptions;

public class Task11 {
    public static void main(String[] args) {
        String[] inputs = {"abc", "1", "10"};
        int[] numbers = {10, 20, 30};
        for (String input : inputs) {
            try {
                int index = Integer.parseInt(input);
                System.out.println(input + " -> " + numbers[index]);
            } catch (NumberFormatException e) {
                System.out.println(input + " -> Invalid number");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(input + " -> Invalid index");
            }
        }
    }
}
