package Files21;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        File dir = new File("src/com/developia/javafiles/folder/Games");

        boolean created = dir.mkdir();
        System.out.println("Created: " + created);
        System.out.println("Exists: " + dir.exists());
        System.out.println("Is directory: " + dir.isDirectory());
    }
}
