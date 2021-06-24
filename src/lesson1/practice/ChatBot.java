package lesson1.practice;

import lesson1.practice.dao.UserDAO;
import lesson1.practice.models.User;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-- Регистрация нового user-а");
            System.out.print("Введите логин: ");
            String login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            if (userDAO.registerNewUser(user)) {
                System.out.println("User c логином "
                        + login + " успешно зарегистрирован");
            } else {
                System.out.println("User с логином " + login +
                        " уже существует");
            }
            System.out.println("------------------");
            for (User u : userDAO.users()) {
                if (u == null) break;
                System.out.println(u);
            }
        }
    }
}
