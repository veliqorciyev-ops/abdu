package urok11Methods;

public class Card {
    String cardNumber;
    String Owner;
    int balance;
    boolean active;
            public String getCardNumber(){
                return cardNumber;
            }
    public String getOwner(){
        return Owner;
    }
    public int getBalance(){
        return balance;
    }
    public boolean getStatus(){
        return active;
    }

    public void addMoney(int amount) {
      if (amount>0){
          balance +=amount;
          System.out.println(amount +balance);
      }else {
          System.out.println("Сумма должна быть больше0");
      }
    }


    public boolean hasEnoughMoney(int amount) {
        return balance>=amount;
    }

    public void pay(int amount) {
        if (!active){
            System.out.println("Card is an unactive");
        } else if (!hasEnoughMoney(amount)) {
            System.out.println("not enough money in card");
        }else {
            balance -=amount;
            System.out.println("pay is sent"+amount+ "successfully Ostatok"+balance);
        }


    }
    }

