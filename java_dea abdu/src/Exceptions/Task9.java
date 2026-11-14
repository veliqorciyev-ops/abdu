package Exceptions;

public class Task9 {
    public static void main(String[] args) {
        int age=-5;
        try {
            if (age<0){
                throw new IllegalArgumentException("Invalid age");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Invalid age!");
        }
    }
}
