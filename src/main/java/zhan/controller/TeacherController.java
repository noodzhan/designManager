package zhan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.mapper.entity.Example;
import zhan.mapper.ClazzMapper;
import zhan.mapper.StudentMapper;
import zhan.pojo.Clazz;
import zhan.pojo.Student;
import zhan.pojo.Teacher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/t")
public class TeacherController {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    ClazzMapper clazzMapper;
    //未开题和开题审核
    @RequestMapping("/nobegin")
    public ModelAndView nobegin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        Student student = new Student();
        student.setTid(teacher.getId());
        List<Student> studentList = studentMapper.select(student);
        for (Student s:studentList) {
            System.out.println(s.toString());
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("/pages/t_nobegin.jsp");
        return modelAndView;
    }


    @RequestMapping("/download")
    public void downFile(@RequestParam Long sid, int kind, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //根据学生sid查地址
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        Student student = new Student();
        System.out.println("sid:"+sid);
        student.setId(sid);
        Student selectOne = studentMapper.selectOne(student);
        System.out.println(selectOne.toString());
        String path = request.getServletContext().getRealPath("/WEB-INF/");
        if(kind==0){
            //开题
            path += selectOne.getBeginUrl();
            System.out.println(path);
            if(selectOne.getBeginStatus()!=1)
                return ;
        }else if(kind==1){
            //中期
            path += selectOne.getMidUrl();
            System.out.println(path);
            if(selectOne.getMidStatus()!=1)
                return ;
        }else{
            //后期
            path += selectOne.getMidUrl();
            System.out.println(path);
            if(selectOne.getEndStatus()!=1)
                return ;
        }
        // 处理文件名
        String realname = path.substring(path.lastIndexOf("\\")+ 1);
        // 设置响应头，控制浏览器下载该文件
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(realname, "UTF-8"));
        // 读取要下载的文件，保存到文件输入流
        FileInputStream in = new FileInputStream(path);
        // 创建输出流
        OutputStream out = response.getOutputStream();
        // 创建缓冲区
        byte buffer[] = new byte[1024];
        int len = 0;
        // 循环将输入流中的内容读取到缓冲区当中
        while ((len = in.read(buffer)) > 0) {
            // 输出缓冲区的内容到浏览器，实现文件下载
            out.write(buffer, 0, len);
        }
        // 关闭文件输入流
        in.close();
        // 关闭输出流
        out.close();
    }

    //未提交中期和中期审核
    @RequestMapping("/nomid")
    public ModelAndView nomid(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        Student student = new Student();
        student.setTid(teacher.getId());
        List<Student> studentList = studentMapper.select(student);
        for (Student s:studentList) {
            System.out.println(s.toString());
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("/pages/t_nomid.jsp");
        return modelAndView;
    }

    //未提交论文和论文审核
    @RequestMapping("/noend")
    public ModelAndView noend(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        Student student = new Student();
        student.setTid(teacher.getId());
        List<Student> studentList = studentMapper.select(student);
        for (Student s:studentList) {
            System.out.println(s.toString());
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("/pages/t_noend.jsp");
        return modelAndView;
    }

    //提交开题审核或者是中期审核或者是论文审核
    @RequestMapping("/insertremark")
    @ResponseBody
    public Boolean insertRemark(HttpServletRequest request,@RequestParam String content,@RequestParam String snumber,@RequestParam int kind){
        System.out.println("content:" + content + "snumber:" + snumber + "kind:" + kind);
        Student student = new Student();
        student.setSnumber(snumber);
        if(kind==0){
            student.setBeginRemark(content);
        }else if(kind==1){
            student.setMidRemark(content);
        }else{
            student.setEndRemark(content);
        }

        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("snumber", student.getSnumber());
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);
        return flag>0?true:false;
    }

    //修改开题（中期）（后期）状态
    @RequestMapping("/updateStatus")
    @ResponseBody
    public Boolean updateStatus(HttpServletRequest request,@RequestParam int status,@RequestParam String snumber,@RequestParam int kind){
        System.out.println("status:" + status + "snumber:" + snumber + "kind:" + kind);
        Student student = new Student();
        student.setSnumber(snumber);
        if(kind==0){
            student.setBeginStatus(status);
        }else if(kind==1){
            student.setMidStatus(status);
        }else{
            student.setEndStatus(status);
        }

        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("snumber", student.getSnumber());
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);
        return flag>0?true:false;
    }

    //修改开题（中期）（后期）成绩
    @RequestMapping("/updateSorces")
    @ResponseBody
    public Boolean updateSorces(HttpServletRequest request,@RequestParam float sorces,@RequestParam String snumber,@RequestParam int kind){
        System.out.println("sorces:" + sorces + "snumber:" + snumber + "kind:" + kind);
        Student student = new Student();
        student.setSnumber(snumber);
        if(kind==0){
            student.setBeginSorces(sorces);
        }else if(kind==1){
            student.setMidSorces(sorces);
        }else{
            student.setEndSorces(sorces);
        }

        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("snumber", student.getSnumber());
        example.and(criteria);
        int flag = studentMapper.updateByExampleSelective(student,example);
        return flag>0?true:false;
    }

    //查看学生的评语
    @RequestMapping("/suggest")
    public ModelAndView suggest(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        Student student = new Student();
        student.setTid(teacher.getId());
        List<Student> studentList = studentMapper.select(student);
        for (Student s:studentList) {
            System.out.println(s.toString());
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("/pages/t_suggest.jsp");
        return modelAndView;
    }

    //上传题目
    @RequestMapping("/insertClass")
    @ResponseBody
    public Boolean insertClass(HttpServletRequest request, @RequestBody Clazz clazz){
        if (clazz == null) {
            return false;
        }
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("user");
        clazz.setTid(teacher.getId());
        clazz.setBirth(new Date());
        int flag = clazzMapper.insertSelective(clazz);
        return flag>0?true:false;
    }



}
