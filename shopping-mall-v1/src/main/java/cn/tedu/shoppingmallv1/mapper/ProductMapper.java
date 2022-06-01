package cn.tedu.shoppingmallv1.mapper;

import cn.tedu.shoppingmallv1.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid where id=#{id}")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectById(int id);
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid where title like concat('%',#{wd},'%')")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectByWd(String wd);
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid order by price")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectByPriceASC();
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid order by price desc")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectByPriceDESC();
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid order by sale_count")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectBySaleCountASC();
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid order by sale_count desc")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectBySaleCountDESC();
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid order by score")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectScoreASC();
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid order by score desc")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectScoreDESC();
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid where category like concat('%',#{category},'%')")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectCategory(String category);
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid where brand=#{brand}")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectBrand(String brand);
    @Select("select id,title,description,category,brand,type,cover,price,old_price,stock,sale_count,comment_count,score,img from product p join product_imgs pi on p.id=pi.pid where price between #{low} and #{high} order by price desc")
    @Result(property = "oldPrice",column = "old_price")
    @Result(property = "saleCount",column = "sale_count")
    @Result(property = "commentCount",column = "comment_count")
    List<Product> selectPriceRange(Integer low, Integer high);
}
