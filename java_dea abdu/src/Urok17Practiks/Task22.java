package Urok17Practiks;

public class Task22 {
    public static void main(String[] args) {
        String address = "play.minecraft.com:25565";
        int index = address.indexOf(":");
        String server = address.substring(0, index);
        String port = address.substring(index + 1);
        System.out.println(server);
        System.out.println(port);
    }
}