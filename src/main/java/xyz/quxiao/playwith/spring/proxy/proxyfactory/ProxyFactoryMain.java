package xyz.quxiao.playwith.spring.proxy.proxyfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;
import xyz.quxiao.playwith.spring.proxy.Dice;
import xyz.quxiao.playwith.spring.proxy.RandomDice;

/**
 * @author 作者 :quxiao 创建时间：2019/11/1 11:31
 */
public class ProxyFactoryMain {

  private static final Logger logger = LoggerFactory.getLogger(ProxyFactoryMain.class);

  public static void main(String[] args) {

    ProxyFactory proxyFactory = new ProxyFactory(new RandomDice());

    proxyFactory.addAdvice(new BeforeDiceAdvice());
    proxyFactory.addAdvice(new AfterDicingAdvice());

    Dice proxy = (Dice) proxyFactory.getProxy();
    Dice proxy2 = (Dice) proxyFactory.getProxy();
    /*int dice = proxy.dice();
    logger.info("dice result:{}", dice);
    logger.info("dice == dice2: {}", proxy == proxy2);*/

    boolean equals = proxy.equals(proxy2);
    logger.info("equals:{}", equals);
  }

}
