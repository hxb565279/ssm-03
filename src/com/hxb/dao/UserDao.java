package com.hxb.dao;

import com.hxb.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User findUser(@Param("username") String username, @Param("password") String password);
}
