package lesson1.theory.core;

public class DebitCard extends Card {
    public DebitCard(int deposit) {
        super(deposit);
    }

    public void putMoneyOnTheCard(int money) {
        deposit += getMoneyWithoutCommission(money);
    }

    public void withdrawMoneyFromTheCard(int money) {
        if (money > deposit) {
            System.out.println("Недостаточно средств");
        } else {
            deposit = deposit - money;
        }
    }
}
