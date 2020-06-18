package zhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhan.mapper.ClazzMapper;
import zhan.mapper.StudentMapper;
import zhan.pojo.Clazz;
import zhan.pojo.Student;
import zhan.service.StuService;

import java.util.List;
@Service("StuService")
public class StuServiceImpl implements StuService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> findBySnumber(String snumber) {
        Student student = new Student();
        student.setSnumber(snumber);
        return studentMapper.select(student);
    }
}
