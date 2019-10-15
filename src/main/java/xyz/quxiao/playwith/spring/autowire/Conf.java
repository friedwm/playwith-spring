package xyz.quxiao.playwith.spring.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 验证注入依赖的入口在 populateBean，由AutowiredAnnotationBeanPostProcessor完成
 * @author 作者 :quxiao 创建时间：2019/10/15 22:07
 */
@Configuration
@ComponentScan(basePackageClasses = Conf.class)
public class Conf {

  @Bean
  public ClassRoom classRoom() {
    return new ClassRoom();
  }


  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
        Conf.class);

    ClassRoom classRoom = ac.getBean(ClassRoom.class);
    Student student = classRoom.getStudent();
    System.out.println(student.getName());
  }
}
