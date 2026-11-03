package Urok17Practiks;

public class Task17 {
    public static void main(String[] args) {
        String product = "Apple iPhone 16 Pro";
        System.out.println(product.contains("iPhone"));
        System.out.println(product.substring(0, 5));
        product = product.replace("16", "17");
        System.out.println(product);
    }
}
