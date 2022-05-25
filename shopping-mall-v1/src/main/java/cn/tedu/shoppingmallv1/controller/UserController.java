package cn.tedu.shoppingmallv1.controller;


import cn.tedu.shoppingmallv1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired(required = false)
    UserMapper mapper;
}
