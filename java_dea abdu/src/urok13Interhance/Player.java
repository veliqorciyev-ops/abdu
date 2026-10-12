package urok13Interhance;

public class Player {
    String nickname;
    int health;
    public void showInfo(){
        System.out.println(nickname+":"+health);
    }
}
class Warrior extends Player{
    int damage;
    public void attack(){
        System.out.println(nickname+":"+damage);
    }
}
class Mage extends Player{
    int mana;
    public void castSpell(){
        System.out.println(nickname+":"+mana);
    }
}
class Main1{
    public static void main(String[] args) {
        Warrior warrior=new Warrior();
        warrior.nickname="Zakir";
        warrior.health=100;
        warrior.damage=99;
        warrior.showInfo();
        warrior.attack();
        Mage mage=new Mage();
        mage.nickname="Anar";
        mage.health=80;
        mage.mana=120;
        mage.showInfo();
        mage.castSpell();

    }
}

