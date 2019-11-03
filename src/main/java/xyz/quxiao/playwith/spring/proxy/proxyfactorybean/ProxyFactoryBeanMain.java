package xyz.quxiao.playwith.spring.proxy.proxyfactorybean;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.quxiao.playwith.spring.proxy.Dice;
import xyz.quxiao.playwith.spring.proxy.RandomDice;
import xyz.quxiao.playwith.spring.proxy.proxyfactory.AfterDicingAdvice;

/**
 * @author 作者 :quxiao 创建时间：2019/11/2 16:42
 */
public class ProxyFactoryBeanMain {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Conf.class);

    Dice dice = ac.getBean("dice", Dice.class);
    int ret = dice.dice();
    System.out.println("ret:" + ret);
  }

  @Configuration
  public static class Conf {

    @Bean(name = "dice")
    public ProxyFactoryBean proxyFactoryBean() {
      ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
      proxyFactoryBean.setTarget(dice());
      proxyFactoryBean.setInterceptorNames("afterDicingAdvice");

      return proxyFactoryBean;
    }

    @Bean
    public AfterDicingAdvice afterDicingAdvice() {
      return new AfterDicingAdvice();
    }

    @Bean(autowireCandidate = false)
    public Dice dice() {
      return new RandomDice();
    }
  }
}
