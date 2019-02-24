package com.atguigu.springboot.mapper;


import com.atguigu.springboot.bean.user_login;
import org.apache.ibatis.annotations.*;


//  指定这是一个操作数据库的mapper
@Mapper
public interface user_loginMapper {


    @Select("select * from user_login where id= #{id}")
    public user_login getUserById(Integer id);

    @Delete("delete from user_login where id = #{id}")
    public int  deleteUserById(Integer id);

    @Insert("insert into user_login(user_name,user_pwd) values(#{user_name,user_pwd})")
    public  int  insertUser(user_login user_login);

    @Update("update user_login set user_name=#{user_name} user_pwd=#{user_pwd } where id =#{id}")
    public  int updateUser(user_login user_login);
}
