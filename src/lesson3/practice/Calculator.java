package lesson3.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        System.out.println("Калькулятор");
        System.out.print("Введите первое число: ");
        try {
            firstNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Это не число");

        }
        scanner.nextLine();
        System.out.print("Введите второе число: ");
        try {
            secondNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Это не число");

        }
        try {
            int result = firstNumber / secondNumber;
            System.out.println("Ответ: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении на 0");
        }
    }
}
