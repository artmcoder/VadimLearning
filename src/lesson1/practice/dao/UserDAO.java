package lesson1.practice.dao;

import lesson1.practice.models.User;

public interface UserDAO {
    boolean registerNewUser(User user);

    boolean loginUser(String login, String password);

    User[] users();
}
