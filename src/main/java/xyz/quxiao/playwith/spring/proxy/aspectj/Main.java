package xyz.quxiao.playwith.spring.proxy.aspectj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import xyz.quxiao.playwith.spring.proxy.Dice;
import xyz.quxiao.playwith.spring.proxy.RandomDice;

/**
 * @author 作者 :quxiao 创建时间：2019/10/22 21:50
 */
public class Main {

  @Configuration
  @EnableAspectJAutoProxy
  public static class Conf {

    @Bean
    public AspectJAspect aspectJAspect() {
      return new AspectJAspect();
    }

    @Bean
    public Dice dice() {
      return new RandomDice();
    }
  }

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
        Conf.class);

    Dice dice = ac.getBean("dice", Dice.class);
    int ret = dice.dice();
    System.out.println("ret:" + ret);
  }
}
