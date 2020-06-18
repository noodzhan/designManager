package zhan.service;

import zhan.pojo.Clazz;
import zhan.pojo.Student;

import java.util.List;

public interface StuService {
    public List<Student> findBySnumber(String snumber);


}
