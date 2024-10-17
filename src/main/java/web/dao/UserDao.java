package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void adduser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User getUser(int id);

    List<User> getAllUsers();
}
