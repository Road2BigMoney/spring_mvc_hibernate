package dao;

import models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private List<User> userList = new ArrayList<User>();
    {
        userList.add(new User(1,"Jim",1000));
        userList.add(new User(2,"Jim1",10001));
        userList.add(new User(3,"Jim2",10002));

    }
    public List<User> index() {
        return userList;
    }
    public User show(int id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
