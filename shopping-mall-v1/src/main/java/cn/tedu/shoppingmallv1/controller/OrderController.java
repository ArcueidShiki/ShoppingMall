package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired(required = false)
    OrderMapper mapper;
}
