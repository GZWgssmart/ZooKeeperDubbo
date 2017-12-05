package top.zywork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zywork.service.UserService;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/config/spring-*.xml"})
public class ConsumerTest {

    @Resource
    private UserService userService;

    @Test
    public void testGetById() {
        System.out.println(userService.getById());
    }

}
