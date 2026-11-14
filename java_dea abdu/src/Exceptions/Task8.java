package Exceptions;

public class Task8 {
    public static void main(String[] args) {
        try {
            int result =10/0;
        }catch (ArithmeticException e){
            System.out.println("Error occurred!");
        }finally {
            System.out.println("Program finished!");
        }


    }
}
