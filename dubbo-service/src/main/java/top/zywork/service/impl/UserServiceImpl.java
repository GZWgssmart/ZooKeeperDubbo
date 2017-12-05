package top.zywork.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import top.zywork.bean.User;
import top.zywork.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getById() {
        return new User(1L, "test");
    }
}
