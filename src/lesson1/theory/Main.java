package lesson1.theory;

import lesson1.theory.core.Card;
import lesson1.theory.core.CreditCard;
import lesson1.theory.core.DebitCard;

public class Main {
    public static void main(String[] args) {
        Card card = new CreditCard(1000);
        card.putMoneyOnTheCard(600);
        System.out.println(card.getDeposit());
        card.withdrawMoneyFromTheCard(200);
        System.out.println(card.getDeposit());
        card = new DebitCard(1000);
        card.putMoneyOnTheCard(600);
        System.out.println(card.getDeposit());
        card.withdrawMoneyFromTheCard(200);
        System.out.println(card.getDeposit());
    }
}
