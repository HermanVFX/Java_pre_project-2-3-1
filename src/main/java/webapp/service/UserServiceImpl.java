package webapp.service;

import org.springframework.stereotype.Service;
import webapp.dao.UserDAO;
import webapp.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void updateUserByID(Long id, User user) {
        userDAO.updateUserByID(id, user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDAO.deleteUserById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
