import com.sun.dao.StudentMapper;
import com.sun.dao.TeacherMapper;
import com.sun.pojo.Student;
import com.sun.pojo.Teacher;
import com.sun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        for (Teacher teacher : mapper.getTeacher()) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudentList2()) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
