package lesson1.theory.core;

public class DebitCard extends Card {
    public DebitCard(int deposit) {
        super(deposit);
    }

    public void putMoneyOnTheCard(int money) {
        int commission = money * 2 / 100;
        money = money - commission;
        deposit += money;
    }

    public void withdrawMoneyFromTheCard(int money) {
        if (money > deposit) {
            System.out.println("Недостаточно средств");
        } else {
            deposit = deposit - money;
        }
    }
}
