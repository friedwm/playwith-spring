package xyz.quxiao.playwith.spring.proxy.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author 作者 :quxiao 创建时间：2019/10/22 21:45
 */
@Aspect
public class AspectJAspect {

  @AfterReturning(pointcut = "execution(int xyz.quxiao.playwith.spring.proxy.Dice.dice())", argNames = "rDice", returning = "rDice")
  public void collectReturnAdvice(int rDice) {
    System.out.println("afterReturning rolled:" + rDice);
  }
}
