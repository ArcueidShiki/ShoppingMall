package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.entity.Product;
import cn.tedu.shoppingmallv1.mapper.ShopCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopCartController {
    @Autowired(required = false)
    ShopCartMapper mapper;

    @RequestMapping("/user/shopCart/select")
    public List<Product> select(){
        return mapper.select();
    }

    @RequestMapping("/user/shopCart/add")
    public String insert(){
        return mapper.insert();
    }

    @RequestMapping("/user/shopCart/update")
    public String update(){
        return mapper.update();
    }

    @RequestMapping("/user/shopCart/delete")
    public String deleteById(){
        return mapper.delete();
    }
}
