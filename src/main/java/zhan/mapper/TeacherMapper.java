package zhan.mapper;

import zhan.pojo.Teacher;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface TeacherMapper extends Mapper<Teacher> {

}