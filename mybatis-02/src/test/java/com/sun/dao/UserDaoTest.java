package com.sun.dao;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.sun.pojo.User;
import com.sun.utils.MybatisUtils;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (User user : mapper.getUserList()) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
