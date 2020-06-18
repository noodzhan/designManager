package zhan.mapper;


import tk.mybatis.mapper.common.Mapper;
import zhan.pojo.Admin;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface AdminMapper extends Mapper<Admin> {

}