package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired(required = false)
    ProductMapper mapper;
}
