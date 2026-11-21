package Files21;

import java.io.File;
import java.io.IOException;

public class File5 {
    public static void main(String[] args) {
        File gamesDir = new File("src/com/developia/javafiles/folder/Games");

        File minecraft = new File(gamesDir, "Minecraft.txt");
        File roblox = new File(gamesDir, "Roblox.txt");
        File fortnite = new File(gamesDir, "Fortnite.txt");

        try {
            minecraft.createNewFile();
            roblox.createNewFile();
            fortnite.createNewFile();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}