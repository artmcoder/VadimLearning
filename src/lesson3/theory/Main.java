package lesson3.theory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usernames[] = { "Андрей", "Едуард", "Егор" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Поиск по имени: ");
        String name = scanner.nextLine();
        try {
            findUserByUsername(name, usernames);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void findUserByUsername(String name, String[] usernames)
            throws UserNotFoundException {
        for (String n : usernames) {
            if (n.equals(name)) {
                System.out.println("Пользователь найден");
                return;
            }
        }
        throw new UserNotFoundException("Пользователь с именем " + name + " не найден");
    }
}
