package com.hxb.service;

import com.hxb.po.User;

public interface UserService {
    User findUser(String username, String password);
}
