package com.sun.dao;

import com.sun.pojo.User;
import com.sun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;

public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (User user : mapper.getUserList()) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:进入");
        logger.debug("debug:进入");
        logger.error("error:进入");
    }

    @Test
    public void testLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        for (User user : mapper.getUserByLimit(map)) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
