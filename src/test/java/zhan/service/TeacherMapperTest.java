package zhan.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhan.mapper.TeacherMapper;
import zhan.pojo.Teacher;

public class TeacherMapperTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherMapper bean = ac.getBean(TeacherMapper.class);
        Teacher t = new Teacher();
        t.setId(new Long(1));
        Teacher teacher = bean.selectByPrimaryKey(t);
        teacher.toString();
    }
}
