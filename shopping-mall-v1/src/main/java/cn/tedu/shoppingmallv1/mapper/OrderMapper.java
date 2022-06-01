package cn.tedu.shoppingmallv1.mapper;

import cn.tedu.shoppingmallv1.entity.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("select p.title,o.buy_count,o.status,o.created from" +
            " product p join orders o on o.pid=p.id" +
            " join user_orders uo on uo.oid=o.id join user u where u.id=#{id} ")
    @Result(property = "buyCount", column = "buy_count")
    @Result(property = "status", column = "status")
    @Result(property = "created", column = "created")
    List<Order> selectById(int id);


    @Insert( "insert into orders(did,uid,pid,buy_count,created) values(#{did}, #{uid},#{pid},#{buyCount},#{created})")
    @Result(property = "buyCount" ,column = "buy_count")
    void orderAddId(int id);


    @Update("update order set buy_count=#{buyCount} where id=#{id}")
    void orderByPid(Order order);


    @RequestMapping("select p.title,p.cover,o.buy_count,o.status,o.created from product p join orders o on o.pid=p.i join user_orders uo on uo.oid=o.id join user u where p.id=#{pid} ")
    List<Object> selectByPid(int pid);
}
