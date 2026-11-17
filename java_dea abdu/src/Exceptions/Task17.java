package Exceptions;

public class Task17 {
    static int calculate() {
        try {
            return 100;
        } finally {
            System.out.println("Calculation finished!");
        }
    }
    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
