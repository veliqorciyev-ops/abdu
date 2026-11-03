package Urok17Practiks;

public class Task10 {
    public static void main(String[] args) {
        String fileName = "abdu.zip";
        System.out.println(fileName.endsWith(".zip"));
        int dot = fileName.lastIndexOf(".");
        System.out.println(fileName.substring(dot + 1));
    }
}

