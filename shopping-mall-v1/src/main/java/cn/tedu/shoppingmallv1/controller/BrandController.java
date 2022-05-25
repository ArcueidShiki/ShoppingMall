package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
    @Autowired(required = false)
    BrandMapper mapper;
}
