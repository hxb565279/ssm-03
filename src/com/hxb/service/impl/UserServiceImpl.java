package com.hxb.service.impl;

import com.hxb.dao.UserDao;
import com.hxb.po.User;
import com.hxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUser(String username, String password) {
        return this.userDao.findUser(username, password);
    }

    @Override
    public int registerUser(String username, String password) {
        return this.userDao.registerUser(username,password);
    }
}
