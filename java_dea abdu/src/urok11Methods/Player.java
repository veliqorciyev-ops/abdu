package urok11Methods;

public class Player {


    String nickname;
    int level;
    int health;
    int damage;

    public void showPlayerInfo() {
        System.out.println("Никнейм: " + nickname);
        System.out.println("Уровень: " + level);
        System.out.println("Здоровье: " + health);
        System.out.println("Урон: " + damage);
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public int healing() {
        while (health < 100) {
            health++;
        }
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void levelUp() {
        level++;
        damage += 5;
    }


    }

