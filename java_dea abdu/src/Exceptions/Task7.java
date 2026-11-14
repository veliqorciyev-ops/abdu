package Exceptions;

public class Task7 {
    public static void main(String[] args) {
        String input = "abc123";
        try {
            int result=Integer.parseInt(input);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
