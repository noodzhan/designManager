package zhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhan.mapper.ClazzMapper;
import zhan.pojo.Clazz;
import zhan.service.ClazzService;

import java.util.List;

@Service("ClazzService")
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    ClazzMapper clazzMapper;
    @Override
    public List<Clazz> findAll() {
        return clazzMapper.selectAll();
    }
}
