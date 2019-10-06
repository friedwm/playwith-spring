package xyz.quxiao.playwith.spring.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 作者 :quxiao 创建时间：2019/9/29 14:17
 */
public class Runner {

  @Configuration
  public static class Conf {

    @Bean("compA")
    @DependsOn("compB")
    public A a() {
      return new A();
    }

    @Bean("compB")
    public B b() {
      return new B();
    }
  }

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
        Conf.class);
    A compA = ac.getBean("compA", A.class);
    compA.test();

  }
}
