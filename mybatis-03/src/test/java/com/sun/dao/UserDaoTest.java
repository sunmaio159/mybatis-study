package com.sun.dao;

import com.sun.pojo.User;
import com.sun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

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
}
