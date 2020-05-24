package com.sun.dao;
import com.sun.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();

    User getUserByid(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserByLimit(Map<String, Integer> map);
}
