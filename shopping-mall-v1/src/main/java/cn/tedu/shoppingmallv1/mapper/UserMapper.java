package cn.tedu.shoppingmallv1.mapper;

import cn.tedu.shoppingmallv1.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select username from user where username=#{username}")
    User selectByName(String username);

    @Select("select * from user where username=#{username}")
    @Result(property = "paymentPassword",column = "payment_password")
    User selectUser(String username);

    @Insert("insert into user(username,password) values(#{username},#{password})")
    void insert(User user);
}
