package com.lk.dao;

import com.lk.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public String selTeacher(int id){
        String sql="select name from teacher where id=?";
        return (String)jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper(Teacher.class));

    }
}
