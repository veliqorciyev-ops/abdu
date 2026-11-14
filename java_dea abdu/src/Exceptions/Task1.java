package Exceptions;

public class Task1 {
        public static void main(String[] args) {
            int a = 100;
            int b = 0;
            try {
             int result=a/b;
            } catch (ArithmeticException e) {
                System.out.println("  Error: Cannot divide by zero!");
            }
        }
}



