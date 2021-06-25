package lesson1.practice;

import lesson1.practice.dao.UserDAO;
import lesson1.practice.models.User;

import java.util.Scanner;

public class ChatBot {
    private final static String ANSWER_TO_LOGIN = "логин";
    private final static String ANSWER_TO_REGISTRATION = "регистрация";
    private final static String ANSWER_TO_SHOW_DB = "база данных";

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Чтобы войти в личный кабинет, напишите " +
                "'логин'.\n-- Чтобы зарегистрироваться напишите 'регистрация'" +
                "\n-- Чтобы посмотреть список пользователей напишите 'база данных'");
        while (true) {
            System.out.print("Жду вашей команды: ");
            String command = scanner.nextLine();
            switch (command) {
                case ANSWER_TO_LOGIN:
                    System.out.println("-- Авторизация");
                    System.out.print("Введите логин: ");
                    String loginFromLogin = scanner.nextLine();
                    System.out.print("Введите пароль: ");
                    String passwordFromLogin = scanner.nextLine();
                    if (!userDAO.loginUser(loginFromLogin, passwordFromLogin)) {
                        System.out.println("-- Логин или пароль являются неверными");
                    } else {
                        System.out.println("-- Пользователь " + loginFromLogin + " успешно авторизирован");
                    }
                    break;
                case ANSWER_TO_REGISTRATION:
                    System.out.println("-- Регистрация нового пользователя");
                    System.out.print("Введите логин: ");
                    String loginFromRegistration = scanner.nextLine();
                    System.out.print("Введите пароль: ");
                    String passwordFromRegistration = scanner.nextLine();
                    User user = new User();
                    user.setLogin(loginFromRegistration);
                    user.setPassword(passwordFromRegistration);
                    if (!userDAO.registerNewUser(user)) {
                        System.out.println("-- Пользователь с логином " + loginFromRegistration
                                + " уже существует");
                    } else {
                        System.out.println("-- Пользователь успешно зарегистрирован");
                    }
                    break;
                case ANSWER_TO_SHOW_DB:
                    User[] users = userDAO.users();
                    System.out.println("-- Список пользователей:");
                    for (int i = 0; i < users.length; i++) {
                            if (users[i] == null) {
                                if (i == 0) {
                                    System.out.println("-> Пользователей пока нет");
                                }
                                break;
                            }
                            System.out.println("-> " + users[i]);
                    }
                    break;
                default:
                    System.out.println("-- Я вас не понял, попробуйте ещё раз");
            }
        }
    }
}
