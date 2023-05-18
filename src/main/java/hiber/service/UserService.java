package hiber.service;

import hiber.model.User;
import org.springframework.ui.Model;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    User getUserByCar(String model, int series);
}
