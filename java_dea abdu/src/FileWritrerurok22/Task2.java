package FileWritrerurok22;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/Hello.txt", StandardCharsets.UTF_8)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}