package lesson1.theory;

import lesson1.theory.core.CreditCard;
import lesson1.theory.core.DebitCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);
        creditCard.putMoneyOnTheCard(600);
        System.out.println(creditCard.getDeposit());
        creditCard.withdrawMoneyFromTheCard(200);
        System.out.println(creditCard.getDeposit());
        DebitCard debitCard = new DebitCard(1000);
        debitCard.putMoneyOnTheCard(600);
        System.out.println(debitCard.getDeposit());
        debitCard.withdrawMoneyFromTheCard(200);
        System.out.println(debitCard.getDeposit());
    }
}
