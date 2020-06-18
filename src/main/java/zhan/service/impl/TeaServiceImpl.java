package zhan.service.impl;

import zhan.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhan.pojo.Teacher;
import zhan.service.TeaService;

import java.util.List;
@Service("TeaService")
public class TeaServiceImpl implements TeaService {
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public List<Teacher> findByTnumber(String tname) {
        Teacher teacher = new Teacher();
        teacher.setTnumber(tname);
        return teacherMapper.select(teacher);
    }
}
