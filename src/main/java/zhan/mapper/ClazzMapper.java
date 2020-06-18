package zhan.mapper;


import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import zhan.pojo.Clazz;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface ClazzMapper extends Mapper<Clazz> {
}