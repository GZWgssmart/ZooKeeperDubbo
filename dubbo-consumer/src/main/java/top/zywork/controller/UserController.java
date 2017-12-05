package top.zywork.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import top.zywork.service.UserService;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    public void getById() {
        System.out.println(userService.getById());
    }
}
