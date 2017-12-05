import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ApplicationAnno {

    public static void main(String... args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config/spring-dubbo-service-anno.xml");
        System.out.println(classPathXmlApplicationContext.getDisplayName());
        classPathXmlApplicationContext.start();
        System.out.println("started...");
        System.in.read();
    }

}
