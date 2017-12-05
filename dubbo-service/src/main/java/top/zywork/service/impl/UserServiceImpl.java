package top.zywork.service.impl;

import top.zywork.bean.User;
import top.zywork.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getById() {
        return new User(1L, "test");
    }
}
