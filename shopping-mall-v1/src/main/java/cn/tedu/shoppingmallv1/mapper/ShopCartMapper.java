package cn.tedu.shoppingmallv1.mapper;

import cn.tedu.shoppingmallv1.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ShopCartMapper {

    @Select("select pid from shop_cart where id=#{pid]")
    List<Product> select();

    @Insert("insert into shopCart values(#{pid},#{buyCount})")
    String insert();


    @Update("update ")
    String update();
}
