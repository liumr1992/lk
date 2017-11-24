package com.lk.controller;

import com.lk.entity.Cla;
import com.lk.entity.Student;
import com.lk.entity.User;
import com.lk.service.ClaService;
import com.lk.service.TeacherService;
import com.lk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Controller

public class UserController {
    @Autowired
    private UserService userService;

    private User user;
    private Cla cla;
    @Resource
    private ClaService cService;

    @RequestMapping("/userLogin")
    public ModelAndView userLogin(String name, String password) {

        User user = new User();


        user = userService.userLogin(name, password);

        ModelAndView modelAndView = new ModelAndView("redirect:/theme");
        modelAndView.addObject(user);

        return modelAndView;


    }

    @RequestMapping("/theme")

    public ModelAndView theme() {
        List<User> list = new ArrayList<User>();
        list = userService.selAll();

        ModelAndView modelAndView = new ModelAndView("theme");
        modelAndView.addObject("users", list);
        return modelAndView;
    }

    @RequestMapping("/delUser")
    @ResponseBody
    public String delUser(String uid) {
        int n = userService.delUser(Integer.parseInt(uid));
        System.out.println(n);


        return "11";

    }

    @RequestMapping("/update")
    public ModelAndView update(int id) {
        user = userService.selByid(id);

        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/updateUser")
    public ModelAndView updateUse(int id, String name, String password, int sex) {
        System.out.println(id + "" + name + "" + sex);
        user.setId(id);
        user.setName(name);
        user.setSex(sex);
        int n = userService.updateUser(user);
        System.out.println(n);
        ModelAndView modelAndView = null;
        if (n > 0) {
            modelAndView = new ModelAndView("redirect:/theme");
            return modelAndView;
        } else {

            System.out.println(n + "编辑失败");
            modelAndView = new ModelAndView("error");
        }
        return modelAndView;


    }

    @RequestMapping("/checkPage")
    public ModelAndView checkPage(int id) {
        System.out.println(id);
        User user = userService.selByid(id);
        System.out.println(user);

        cla = cService.selCla(id);
        Student student = new Student();
        student.setId(user.getId());
        student.setName(user.getName());
        student.setSex(user.getSex());
        student.setScore(cla.getScore());
        student.setCname(cla.getCname());
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("student", student);
        return modelAndView;

    }

    @RequestMapping("/insUser")
    @ResponseBody
    public int insUser() {
        User user1 = new User();
        User user2 = new User();

        user1.setName("李开");
        user1.setPassword("123");
        user1.setSex(1);
        user2.setName("王五");
        user2.setPassword("123");
        user2.setSex(0);

        int n = userService.insUser(user1, user2);
        return n;

    }

    @RequestMapping("/getPage")
    @ResponseBody
    public String getPage(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView();
        String a = "1111";


        return a;

    }

    @RequestMapping("/update1")
    @ResponseBody
    public String update1(@RequestParam("id") int id, @RequestParam("name") String name, String password, @RequestParam("sex") int sex) {
        System.out.println(id + "" + name + "" + "" + password + "" + sex);
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setSex(sex);
        int n = userService.update1(user);
        if (n > 0) {
            return "true";
        } else {
            return "false";
        }


    }
     @RequestMapping("/addUser")
     @ResponseBody
      public int addUser(@RequestParam("id") int id,String name,String password,@RequestParam("sex") int sex){
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setSex(sex);
        int n=userService.addUser(user);
        int a=11;
        return n;


     }

     @Autowired
     private TeacherService teacherService;
      @ResponseBody
    @RequestMapping("/selTeacher")
     public String selTeacher(HttpServletRequest request,HttpServletResponse response){
          response.setContentType("application/json;charset=UTF-8");
          return teacherService.selTeacher(1);


     }
}
