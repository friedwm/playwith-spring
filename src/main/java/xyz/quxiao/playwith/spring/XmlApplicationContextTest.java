package xyz.quxiao.playwith.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import xyz.quxiao.playwith.spring.bean.Fruit;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:06
 */
@Slf4j
public class XmlApplicationContextTest {

  public static void main(String[] args) {
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory(null);
    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
    String path = "/ApplicationContext.xml";
    ClassPathResource classPathResource = new ClassPathResource(path);
    log.info("resource exist:{}", classPathResource.exists());
    reader.loadBeanDefinitions(classPathResource);
    Fruit fruit = beanFactory.getBean("fruit", Fruit.class);
    log.info("fruit name:{}", fruit.getName());
  }
}
