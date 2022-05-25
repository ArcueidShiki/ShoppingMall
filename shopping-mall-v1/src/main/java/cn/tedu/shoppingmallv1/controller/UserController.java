package cn.tedu.shoppingmallv1.controller;


import cn.tedu.shoppingmallv1.entity.User;
import cn.tedu.shoppingmallv1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired(required = false)
    UserMapper mapper;

    //修改测试 merge冲突测试

    // 同时操作一个类时， 出现两人同时提交代码时的合并冲突。
    @RequestMapping("/login")
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

    @RequestMapping("/reg")
    public int reg(@RequestBody User user){
        User u = mapper.selectByName(user.getUsername());
        if(u != null){
         return 2;//用户名被占用
        }
        mapper.insert(user);
        return 1;
    }

}
