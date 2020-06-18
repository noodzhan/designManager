package zhan.service;


import zhan.pojo.Teacher;

import java.util.List;

public interface TeaService {
    public List<Teacher> findByTnumber(String tnumber);
}
