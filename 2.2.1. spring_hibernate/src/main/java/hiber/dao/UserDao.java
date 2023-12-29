package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

    void update(User user);

    List<User> findUsersByCarModelAndSeries(String model, int series);
}
