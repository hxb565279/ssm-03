package com.hxb.controller;

import com.hxb.po.User;
import com.hxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(String username, String password, Model model){
        User user = this.userService.findUser(username, password);
       if (user!=null){
           System.out.println("登录成功");
           return "main";
       }
       model.addAttribute("msg","账号或密码错误,重新登录");
       return "error";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerUser(String username, String password, Model model, HttpServletResponse response) throws IOException {
        int registerUser = this.userService.registerUser(username, password);
        if (registerUser>0){
         return "login";
        }
        return "register";
    }


    @RequestMapping(value = " /text.action",method = RequestMethod.GET)
    public String find(){
        return "main";
    }

    @RequestMapping(value = "/reLogin",method = RequestMethod.GET)
    public String reLogin(){
        return "login";
    }

    @RequestMapping(value = "/reRegister",method = RequestMethod.GET)
    public String reRegister(){
        return "register";
    }
}
