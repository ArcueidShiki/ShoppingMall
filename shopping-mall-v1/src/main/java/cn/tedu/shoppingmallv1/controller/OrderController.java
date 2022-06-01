package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.entity.Order;
import cn.tedu.shoppingmallv1.mapper.OrderMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired(required = false)
    OrderMapper mapper;
    @RequestMapping("/user/orderList/select")
    public List<Object> selectById(int id){
        return mapper.selectById(id);
    }
   @RequestMapping("/user/order/add")
    public void orderAddById(int id){
       mapper.orderAddId(id);
   }
   @RequestMapping("/user/order/update")
    public void orderUpdateByPid(@RequestBody Order order){
        mapper.orderByPid(order);
   }
   @RequestMapping("/user/order/selectbypid")
    public List<Object> selectByPid(int id){
        return mapper.selectByPid(id);
   }
}
