package com.sun.dao;

import com.sun.pojo.User;
import com.sun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        for (User user : mapper.getUserList()) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
