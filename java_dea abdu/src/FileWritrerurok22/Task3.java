package FileWritrerurok22;

import java.io.*;
public class Task3 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/Hello.txt", true)) {
            writer.write("\nJava is interesting!\n");
            writer.write("I like programming.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("src/Hello.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
