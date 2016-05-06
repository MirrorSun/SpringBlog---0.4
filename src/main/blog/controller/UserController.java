package blog.controller;

import blog.pojo.User;
import blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ENVY HP on 2016/5/2.
 */
@Controller
@RequestMapping("/user")
@Scope("prototype")
public class UserController {
    //自动注入业务层的userService类
    @Autowired
    UserService userService;

    //login业务的访问位置为/user/login
    @RequestMapping("/login")
    public String login(User user,HttpServletRequest request){
        boolean loginType = userService.login(user.getUsername(),user.getPassword());
        if(loginType){
            request.setAttribute("user",user);
            return "success";
        }else{
            request.setAttribute("message","用户名密码错误");
            return "error";
        }
    }

}
