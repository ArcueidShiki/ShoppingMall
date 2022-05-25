package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.mapper.DeliveryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {
    @Autowired(required = false)
    DeliveryMapper mapper;
}
