package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.ShopCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopCartController {
    @Autowired(required = false)
    ShopCartMapper mapper;
}
