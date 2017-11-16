package com.lk.dao;

import com.lk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public User userLogin(String name, String password) {
        String sql = "select * from user where name=? and password=? ";
        User user = new User();
        user = (User) jdbcTemplate.queryForObject(sql, new Object[]{name, password}, new BeanPropertyRowMapper(User.class));

        return user;
    }
    public List<User> SelectAll(){

        List<User> list=new ArrayList<User>();
        String sql="select * from user";
        list=jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));

       return list;
    }
    public int delUser(int id){

        String sql="delete from user where id=?";
        return  jdbcTemplate.update(sql,id);

    }
    public User selByid(int id){
        String sql="select * from user where id=?";
        return (User)jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper(User.class));
    }
    public int updateUser(User user){

     String sql="update user set name=?,sex=? where id=?";
     return jdbcTemplate.update(sql,user.getName(),user.getSex(),user.getId());

    }
    public int insUser(User user){
        String sql="insert into user(name,password,sex)values(?,?,?)";
        return jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getSex());


    }
    public int update1(User user){

        String sql="update user set name=?,password=?,sex=? where id=?";
        return jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getSex(),user.getId());

    }

}
