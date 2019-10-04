package xyz.quxiao.playwith.spring.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 作者 :quxiao 创建时间：2019/9/29 14:17
 */
public class Runner {


  public static void main(String[] args) {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:BeanTestApplicationContext.xml");
    A compA = ac.getBean("compA", A.class);
    compA.test();

  }
}
