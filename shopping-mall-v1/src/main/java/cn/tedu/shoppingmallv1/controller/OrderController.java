package cn.tedu.shoppingmallv1.controller;

import cn.tedu.shoppingmallv1.entity.Order;
import cn.tedu.shoppingmallv1.entity.Product;
import cn.tedu.shoppingmallv1.mapper.OrderMapper;
import cn.tedu.shoppingmallv1.web.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired(required = false)
    OrderMapper mapper;

    //用户订单的数据查找
    @RequestMapping("/user/orderList/select")
    public  List<Order> selectById(@RequestBody int id){
       return mapper.selectById(id);
    }

    //用户创建订单业务
   @RequestMapping("/user/order/add")
    public void orderAddById(int id){
       mapper.orderAddId(id);
   }

   //用户修改订单数据业务
   @RequestMapping("/user/order/update")
    public void orderUpdateByPid(@RequestBody Order order){
        mapper.orderByPid(order);
   }

   //用户修改订单业务时,数据回显到前端页面
   @RequestMapping("/user/order/selectbypid")
    public List<Object> selectByPid(int id){
        return mapper.selectByPid(id);
   }
}
