package xyz.quxiao.playwith.spring.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 作者 :quxiao 创建时间：2019/9/29 14:17
 */
public class Runner {

  @Configurable
  @ComponentScan(basePackageClasses = Runner.class)
  public static class BeanTestConf {

  }

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
        BeanTestConf.class);

    A compA = ac.getBean("compA", A.class);
    compA.test();

  }
}
