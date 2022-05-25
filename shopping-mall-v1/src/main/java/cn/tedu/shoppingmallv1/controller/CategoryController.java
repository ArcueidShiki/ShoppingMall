package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired(required = false)
    CategoryMapper mapper;
}
