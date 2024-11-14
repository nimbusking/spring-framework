package cc.nimbusk.main;

import cc.nimbusk.beans.CycleTestA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 循环依赖debug测试程序
 * @author nimbusk
 */
@Configuration
@ComponentScan("cc.nimbusk")
public class IocCycleTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(IocCycleTest.class);
		CycleTestA cycleTestA = (CycleTestA) context.getBean("cycleTestA");
		System.out.println("After create bean: " + cycleTestA.getCycleTestB());
	}
}
