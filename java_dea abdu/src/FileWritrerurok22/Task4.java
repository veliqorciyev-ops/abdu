package FileWritrerurok22;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("src/numbers.bin")) {
            out.write(10);
            out.write(20);
            out.write(30);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream in = new FileInputStream("src/numbers.bin")) {
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}