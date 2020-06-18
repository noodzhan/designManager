package zhan.mapper;


import tk.mybatis.mapper.common.Mapper;
import zhan.pojo.Student;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface StudentMapper extends Mapper<Student> {

}