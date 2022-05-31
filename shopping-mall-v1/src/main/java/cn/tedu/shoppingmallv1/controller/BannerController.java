package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
    @Autowired(required = false)
    BannerMapper mapper;

    //pjl 开始 coding
}
