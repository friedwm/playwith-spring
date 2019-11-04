package xyz.quxiao.playwith.spring.proxy.scopedproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import xyz.quxiao.playwith.spring.proxy.Dice;
import xyz.quxiao.playwith.spring.proxy.Gambler;
import xyz.quxiao.playwith.spring.proxy.RandomDice;

/**
 * @author 作者 :quxiao 创建时间：2019/11/4 12:49
 */
public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
        Conf.class);
    Gambler gambler = ac.getBean("gambler", Gambler.class);
    gambler.rollDice();
    gambler.rollDice();
  }

  @Configuration
  public static class Conf {

    @Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    @Bean
    public Dice dice() {
      return new RandomDice();
    }

    @Bean
    public Gambler gambler() {
      return new Gambler();
    }
  }
}
