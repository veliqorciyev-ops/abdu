package Exceptions;

public class Task4 {
    public static void main(String[] args) {
        String username = null;
        try {
            int length=username.length();
        }catch (NullPointerException e){
            System.out.println("  Username is null!");
        }
    }
}
