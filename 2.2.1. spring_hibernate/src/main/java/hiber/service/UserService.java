package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    List<User> listUsers();
    List<User> findUsersByCarModelAndSeries(String model, int series);
}
