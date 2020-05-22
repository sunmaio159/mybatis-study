package com.sun.dao;
import com.sun.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User getUserByid(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
