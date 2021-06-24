package lesson1.theory.core;

public class CreditCard extends Card {
    public CreditCard(int deposit) {
        super(deposit);
    }

    public void putMoneyOnTheCard(int money) {
        deposit += money;
    }

    public void withdrawMoneyFromTheCard(int money) {
        System.out.println("Операция отклонена");
    }
}
