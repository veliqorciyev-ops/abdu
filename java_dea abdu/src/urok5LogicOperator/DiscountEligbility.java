package urok5LogicOperator;

public class DiscountEligbility {
    public static void main(String[] args) {
        int age =20;
        double purchaseAmount = 150.0;
        boolean isStudent=true;
        boolean getsDiscount = (age < 18 || isStudent) && purchaseAmount >= 100.0;

        System.out.println("Возраст: " + age);
        System.out.println("Сумма покупки: " + purchaseAmount);
        System.out.println("Студент: " + isStudent);
        System.out.println("Право на скидку: " + getsDiscount);
    }
}
