package com.lk.dao;

import com.lk.entity.Cla;
import com.lk.util.DynamicDataSourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClaDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public Cla selCla(int uid){

        String sql="select * from cla where uid=? ";
        return (Cla)jdbcTemplate.queryForObject(sql,new Object[]{uid},new BeanPropertyRowMapper(Cla.class));

    }
}
