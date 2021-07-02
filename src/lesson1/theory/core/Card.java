package lesson1.theory.core;

public abstract class Card {
    public int deposit;

    public Card(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getMoneyWithoutCommission(int money) {
        int commission = money * 2 / 100;
        money = money - commission;
        return money;
    }

    public abstract void withdrawMoneyFromTheCard(int money);

    public abstract void putMoneyOnTheCard(int money);
}
