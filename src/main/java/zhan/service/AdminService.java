package zhan.service;

import tk.mybatis.mapper.common.Mapper;
import zhan.pojo.Admin;
import zhan.pojo.Teacher;

import java.util.List;

public interface AdminService {
    public List<Admin> findByAnumber(String aname);
}
