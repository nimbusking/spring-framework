package cc.nimbusk.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * XML方式加载bean示例
 */
public class IocXmlMainTest {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        int beanCount = reader.loadBeanDefinitions("classpath:/bean_load_lookup.xml");
        System.out.println("bean count: " + beanCount);
        System.out.println("load bean: " + beanFactory.getBean("nimbusk"));
    }

}
