package cc.nimbusk.main;

import cc.nimbusk.beans.HelloWordService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cc.nimbusk")
public class IocAnnotationMainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(IocAnnotationMainTest.class);
		HelloWordService helloWordService = context.getBean(HelloWordService.class);
		helloWordService.sayHello("NimbusK");
	}

}
