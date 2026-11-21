package Files21;

import java.io.File;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) {
        File file = new File("src/com/developia/javafiles/folder/Players.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println(file.exists());
    }
}
