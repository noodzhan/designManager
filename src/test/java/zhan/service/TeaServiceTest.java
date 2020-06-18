package zhan.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhan.mapper.TeacherMapper;
import zhan.pojo.Teacher;
import zhan.service.impl.TeaServiceImpl;

import java.util.List;

public class TeaServiceTest {
    @Autowired
    TeaService teaService;
    @Test
    public void findByNumber() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String str: beanDefinitionNames
        ) {
            System.out.println(str);
        }
        TeacherMapper bean = ac.getBean(TeacherMapper.class);
        List<Teacher> teachers = bean.selectAll();
        for (Teacher t:teachers
        ) {
            System.out.println(t.toString());
        }
        TeaService teaService = ac.getBean(TeaServiceImpl.class);
        List<Teacher> t123 = teaService.findByTnumber("T123");
        for (Teacher t:t123
             ) {
            System.out.println(t.toString());
        }

    }
    @Test
    public void test(){
        String s = "C:\\Users\\zhan\\Desktop\\code\\noodzhan\\DesignManger\\src\\main\\webapp\\WEB-INF\\开题\\S001\\每日任务.md";
        String[] split = s.split("WEB-INF");
        System.out.println(s.substring(s.lastIndexOf("\\")+1));;
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[1]);
    }
}
