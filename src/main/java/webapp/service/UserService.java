package webapp.service;

import webapp.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUserByID(Long id, User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
