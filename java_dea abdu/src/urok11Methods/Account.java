package urok11Methods;

public class Account {
    String username;
    String email;
    int coins;
    int games;
    boolean premium;
    public void showAccountInfo(){
        System.out.println(username);
        System.out.println(email);
        System.out.println(coins);
        System.out.println(games);
        System.out.println(premium);
    }
        public void addCoins(int amount){
        if (amount>0){
            coins+=amount;
            System.out.println("Balance can be "+amount+"All money:"+coins);
        }else {
            System.out.println("Coins should be more than 0");
        }
        }
    public boolean canBuyGAma(int price) {
        return coins >=price;
    }
    public void buyGame(int price){
        if (canBuyGAma(price)){
            coins -=price;
            games++;
            System.out.println("Game is bought successfully!money:"+coins+"all games"+games);
        }else {
            System.out.println("Not enough coins");
        }
    }
}
