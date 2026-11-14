package Exceptions;

public class Task3 {
    public static void main(String[] args) {
        int[] scores = {90, 85, 100};
        int index = 5;
        try {
            System.out.println(scores[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of bounds");
        }
    }
}
