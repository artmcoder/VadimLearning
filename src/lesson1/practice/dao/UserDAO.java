package lesson1.practice.dao;

import lesson1.practice.models.User;

public class UserDAO {
    private User[] usersDb = new User[100];
    private static int USER_ID = -1;

    public boolean registerNewUser(User user) {
        if (userLoginExist(user.getLogin())) {
            user.setId(++USER_ID);
            usersDb[user.getId()] = user;
        } else {
            return false;
        }
        return true;
    }



    public User[] users() {
        return usersDb;
    }

    private boolean userLoginExist(String login) {
        for (User u : usersDb) {
            if (u == null) break;
            if (login.equals(u.getLogin())) {
                return false;
            }
        }
        return true;
    }

    public boolean loginUser(String login, String password) {
        User user = findUserByUsername(login);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        } else return false;
    }

    private User findUserByUsername(String login) {
        for (User u : usersDb) {
            if (u == null) break;
            if (u.getLogin().equals(login)) {
                return u;
            }
        }
       return null;
    }
}
