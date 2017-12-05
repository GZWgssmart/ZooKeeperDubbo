package top.zywork;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.zywork.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/config/spring-context.xml",
        "classpath:/config/spring-dubbo-service-anno.xml"})
public class ControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void testGetById() {
        userController.getById();
    }

}
