package urok13Interhance;

public class Account {
    String username;
    int balance;
    public void setBalance(int amount){
        balance=amount;
    }
    public void showBalance(){
        System.out.println(balance);
    }
}
class GameAccount extends Account{
    int level;
    public void showLevel(){
        System.out.println(level);
    }
}
class Main2{
    public static void main(String[] args) {
        GameAccount account=new GameAccount();
        account.username="Abdu2011";
        account.setBalance(999999);
        account.level=99;
        account.showBalance();
        account.showLevel();
    }
}
