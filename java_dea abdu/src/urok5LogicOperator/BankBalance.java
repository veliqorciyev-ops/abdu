package urok5LogicOperator;

public class BankBalance {
    public static void main(String[] args) {
        int balance=1000;
        System.out.println("Начальный баланс:"+balance);
        balance+=500;
        System.out.println("После+500:"+balance);
        balance-=200;
        System.out.println("После-200:"+balance);
        balance*=2;
        System.out.println("После умножения на 2:"+balance);
        balance/=4;
        System.out.println("После деления на 4:"+balance);
        balance%=100;
        System.out.println("Остаток от деления на 100:"+balance);
    }
}
