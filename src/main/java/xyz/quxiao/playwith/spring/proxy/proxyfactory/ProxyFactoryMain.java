package xyz.quxiao.playwith.spring.proxy.proxyfactory;

import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
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

//    proxyFactory.addAdvice(new BeforeDiceAdvice());
//    proxyFactory.addAdvice(new AfterDicingAdvice());
    AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
    advisor.setExpression("execution(* xyz.quxiao.playwith.spring.proxy.Dice+.dice())");
    AfterReturningAdvice advice = (returnValue, method, args1, target) -> logger.info("afterReturning:{}", returnValue);
    advisor.setAdvice(advice);
    proxyFactory.addAdvisor(advisor);
    Dice proxy = (Dice) proxyFactory.getProxy();
    int dice = proxy.dice();
    logger.info("dice result:{}", dice);
  }

}
