package top.zywork.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zywork.service.UserService;

public class TestController {

    public static void main(String... args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config/spring-dubbo-service.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService.getById());
    }

}
