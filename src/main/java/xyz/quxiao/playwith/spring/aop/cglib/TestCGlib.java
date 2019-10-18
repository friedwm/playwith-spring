package xyz.quxiao.playwith.spring.aop.cglib;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 作者 :quxiao 创建时间：2019/10/17 15:09
 */
public class TestCGlib {


  @EnableAspectJAutoProxy(proxyTargetClass = true)
  @Configuration
  public static class Conf {

    @Bean
    public Student student() {
      return new Student();
    }

    @Bean
    public BeforeInvokeAdvice beforeInvokeAdvice() {
      return new BeforeInvokeAdvice();
    }
  }

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
        Conf.class);

    Student student = ac.getBean(Student.class);

    student.say("world");
  }
}
