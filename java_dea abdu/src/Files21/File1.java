package Files21;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file = new File("src/com/developia/javafiles/folder/HelloWorldFile.txt");
        System.out.println(  file.exists());
        System.out.println( file.getName());
        System.out.println(  file.getAbsolutePath());
        System.out.println( file.getParent());
    }
}