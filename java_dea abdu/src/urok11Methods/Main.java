package urok11Methods;

public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        card.cardNumber = "25376273767";
        card.Owner = "Zakir";
        card.balance = 999999;
        card.active = true;
        System.out.println(card.getCardNumber());
        System.out.println(card.getOwner());
        System.out.println(card.getBalance());
        card.addMoney(200);
        Account account = new Account();
        account.username = "Zakir";
        account.email = "Abdu@gamil.com";
        account.coins = 10000;
        account.games = 99;
        account.premium = true;
        account.showAccountInfo();
        account.addCoins(77);
        Player player = new Player();
        player.nickname = "Zakir";
        player.level = 99;
        player.health = 98;
        player.damage = 99;
        player.takeDamage(40);
        player.isAlive();

        int currentHealth = player.healing();

        player.levelUp();
    }
}
