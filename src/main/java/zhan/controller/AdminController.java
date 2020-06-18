package zhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zhan.mapper.StudentMapper;
import zhan.pojo.Admin;
import zhan.pojo.Clazz;
import zhan.pojo.Student;
import zhan.pojo.Teacher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/a")
public class AdminController {
    @Autowired
    StudentMapper studentMapper;
    //上传题目
    @RequestMapping("/insertStu")
    @ResponseBody
    public Boolean insertClass(HttpServletRequest request, @RequestBody Student student){
        if (student == null) {
            return false;
        }
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("user");
        student.setAid(admin.getId());
        int flag = studentMapper.insertSelective(student);
        return flag>0?true:false;
    }
}
