package zhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import zhan.pojo.Admin;
import zhan.pojo.Student;
import zhan.pojo.Teacher;
import zhan.service.AdminService;
import zhan.service.StuService;
import zhan.service.TeaService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    AdminService adminService;
    @Autowired
    StuService stuService;
    @Autowired
    TeaService teaService;
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam String number, @RequestParam String password, @RequestParam Integer role, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        //老师
        if (role == 1) {
            List<Teacher> tList = teaService.findByTnumber(number);
            if (tList.size() > 0) {
                if(tList.get(0).getTpassword().equals(password)){
                    HttpSession session = request.getSession();
                    session.setAttribute("user",tList.get(0));
                    modelAndView.setViewName("/pages/t_index.jsp");
                }

            }
        }else if(role == 3){
            //管理员
            List<Admin> aList = adminService.findByAnumber(number);
            if (aList.size() > 0) {
                if(aList.get(0).getApassword().equals(password)){
                    HttpSession session = request.getSession();
                    session.setAttribute("user",aList.get(0));
                    modelAndView.setViewName("/pages/a_index.jsp");
                }
            }
        }else{
            //学生
            List<Student> sList = stuService.findBySnumber(number);
            if (sList.size() > 0) {
                if(sList.get(0).getSpassword().equals(password)){
                    HttpSession session = request.getSession();
                    session.setAttribute("user",sList.get(0));
                    modelAndView.setViewName("/pages/s_index.jsp");
                }
            }
        }
        return modelAndView;
    }
    @RequestMapping("/out")
    public ModelAndView leave(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            session.removeAttribute("user");
        }
        modelAndView.setViewName("redirect:/index.jsp");
        return modelAndView;
    }


}
