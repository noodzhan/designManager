package zhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhan.mapper.AdminMapper;
import zhan.mapper.TeacherMapper;
import zhan.pojo.Admin;
import zhan.pojo.Teacher;
import zhan.service.AdminService;

import java.util.List;
@Service("AdminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public List<Admin> findByAnumber(String aname) {
        Admin admin = new Admin();
        admin.setAnumber(aname);
        return adminMapper.select(admin);
    }
}
