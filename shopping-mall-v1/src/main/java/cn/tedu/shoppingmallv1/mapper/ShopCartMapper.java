package cn.tedu.shoppingmallv1.mapper;

import cn.tedu.shoppingmallv1.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShopCartMapper {

    @Select("select pid from shop_cart where id=#{pid]")
    List<Product> select();

    @Insert("insert into shopCart values(#{pid},#{buyCount})")
    String insert();

    @Update("update shop_cart set pid where pid=#{pid}")
    String update();

    @Delete("delete from shop_Cart where id=#{pid}")
    String delete();
}
