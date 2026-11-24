package FileWritrerurok22;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/Hello.txt",StandardCharsets.UTF_8)) {
            writer.write("Hello Java!\n");
            writer.write("My name is Alex.\n");
            writer.write("I am learning Java.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
