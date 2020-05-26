package com.sun.dao;

import com.sun.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from Teacher")
    List<Teacher> getTeacher();
}
