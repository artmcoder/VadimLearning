package lesson1.theory.core;

public class Card {
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
}
