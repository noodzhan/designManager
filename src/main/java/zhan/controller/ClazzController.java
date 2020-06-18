package zhan.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.mapper.entity.Example;
import zhan.mapper.StudentMapper;
import zhan.mapper.TeacherMapper;
import zhan.pojo.Clazz;
import zhan.pojo.Student;
import zhan.pojo.Teacher;
import zhan.service.ClazzService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    ClazzService clazzService;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Clazz> findAll(){

        List<Clazz> clazzList = clazzService.findAll();
        for (Clazz c:clazzList) {
            Teacher t = new Teacher();
            t.setId(c.getTid());
            Teacher teacher = teacherMapper.select(t).get(0);
            c.setTeacher(teacher);
        }

        return clazzList;
    }

    //学生确定开题
    @RequestMapping("/confirm")
    @ResponseBody
    public Boolean confrimClass(@RequestParam Long id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Student student = (Student)session.getAttribute("user");
        Student upStu = new Student();
        BeanUtils.copyProperties(student,upStu);
        //学生选题状态
        upStu.setBeginStatus(1);
        upStu.setCid(id);
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", new Long(student.getId()));
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(upStu,example);
        return flag>0?true:false;
    }


    @RequestMapping("/upload/begin")
    @ResponseBody
    public boolean uploadBegin(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {

        // 判断文件是否为空，空则返回失败页面
        if (file.isEmpty()) {
            return false;
        }
        // 获取文件存储路径（绝对路径）
        String path = req.getServletContext().getRealPath("/WEB-INF");
        System.out.println("path:"+path);
        HttpSession session = req.getSession();
        Student student = (Student)session.getAttribute("user");
        path+="/开题/";
        path += student.getSnumber();
        // 获取原文件名
        String fileName = file.getOriginalFilename();
        // 创建文件实例
        File filePath = new File(path, fileName);
        // 如果文件目录不存在，创建目录
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录" + filePath);
        }
        // 写入文件
        file.transferTo(filePath);
        //System.out.println(filePath.toString().split("/WEB-INF/"));
        String[] split = filePath.toString().split("WEB-INF");
        System.out.println("url:"+split[1]);
        //将url写入到数据库
        student.setBeginUrl(split[1]);
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", new Long(student.getId()));
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);


        return true;
    }
    @RequestMapping("/upload/mid")
    @ResponseBody
    public Boolean uploadMid(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {

        // 判断文件是否为空，空则返回失败页面
        if (file.isEmpty()) {
            return false;
        }
        // 获取文件存储路径（绝对路径）
        String path = req.getServletContext().getRealPath("/WEB-INF");
        HttpSession session = req.getSession();
        Student student = (Student)session.getAttribute("user");
        path+="/中期/";
        path += student.getSnumber();
        // 获取原文件名
        String fileName = file.getOriginalFilename();
        // 创建文件实例
        File filePath = new File(path, fileName);
        // 如果文件目录不存在，创建目录
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录" + filePath);
        }
        // 写入文件
        file.transferTo(filePath);
        //System.out.println(filePath.toString().split("/WEB-INF/"));
        String[] split = filePath.toString().split("WEB-INF");
        System.out.println("url:"+split[1]);
        //将url写入到数据库
        student.setMidUrl(split[1]);
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", new Long(student.getId()));
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);
        return true;
    }


    @RequestMapping("/upload/end")
    @ResponseBody
    public Boolean uploadEnd(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {

        // 判断文件是否为空，空则返回失败页面
        if (file.isEmpty()) {
            return false;
        }
        // 获取文件存储路径（绝对路径）
        String path = req.getServletContext().getRealPath("/WEB-INF/");
        HttpSession session = req.getSession();
        Student student = (Student)session.getAttribute("user");
        path+="/后期/";
        path += student.getSnumber();
        // 获取原文件名
        String fileName = file.getOriginalFilename();
        // 创建文件实例
        File filePath = new File(path, fileName);
        // 如果文件目录不存在，创建目录
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录" + filePath);
        }
        // 写入文件
        file.transferTo(filePath);


        //System.out.println(filePath.toString().split("/WEB-INF/"));
        String[] split = filePath.toString().split("WEB-INF");
        System.out.println("url:"+split[1]);
        //将url写入到数据库
        student.setEndUrl(split[1]);
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", new Long(student.getId()));
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);

        return true;
    }

    @RequestMapping("/advice")
    public ModelAndView advice(HttpServletRequest request){
        HttpSession session = request.getSession();
        Student student = (Student)session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", student);
        modelAndView.setViewName("/pages/s_advice.jsp");

        return modelAndView;
    }


    @RequestMapping("/insertRemark")
    @ResponseBody
    public Boolean insertRemark(HttpServletRequest request,@RequestParam String content){
        HttpSession session = request.getSession();
        Student student = (Student)session.getAttribute("user");
        student.settRemark(content);
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", new Long(student.getId()));
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);
        return flag>0?true:false;
    }

}
