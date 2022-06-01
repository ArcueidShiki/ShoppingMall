package cn.tedu.shoppingmallv1.controller;


import cn.tedu.shoppingmallv1.entity.User;
import cn.tedu.shoppingmallv1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired(required = false)
    UserMapper mapper;

    //修改测试 merge冲突测试
    //白胡子工作室
    // 同时操作一个类时， 出现两人同时提交代码时的合并冲突。
    @RequestMapping("/user/login")
    public int login(@RequestBody User user){
        User u = mapper.selectByName(user.getUsername());
        if(u!=null){
            if(u.getPassword().equals(user.getPassword())){
                return 1;//登录成功
            }
            return 2;//密码错误
        }
        return 3;//用户名不存在
    }

    @RequestMapping(value = "/user/reg",produces = "application/json")
    @ResponseBody
    public int reg(@RequestBody User user){
        User u = mapper.selectByName(user.getUsername());
        if(u != null){
         return 2;//用户名被占用
        }
        mapper.insert(user);
        return 1;
    }
    @RequestMapping("/user/currentUser")
    public User currentUser(HttpSession session){//session得到的同样是当前登录的对象
        //从会话对象中获取登录成功时保存的用户对象
        User u = (User)session.getAttribute("user");//类型强转是因为会话对象什么类型都可以往
        return u;//没登陆过的话会返回一个null,由于JSON会转换二进制,到了javascript里面读回来就变成了一个空字符串
    }

    @RequestMapping("/user/logout")
    public void logout(HttpSession session){
        session.removeAttribute("user");
    }

}
