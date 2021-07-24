package com.atguigu.spring5.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addMoney() {
        String sql="update count set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    public void reduceMoney() {
        String sql="update count set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"nancy");
    }
}
