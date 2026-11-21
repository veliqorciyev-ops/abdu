package Files21;

import java.io.File;

public class File2 {
    public static void main(String[] args) {
        File file = new File("src/com/developia/javafiles/folder/HelloWorld.txt");

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.length());
        System.out.println(file.lastModified());
    }
}


