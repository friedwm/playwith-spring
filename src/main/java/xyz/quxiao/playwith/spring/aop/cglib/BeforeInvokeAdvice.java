package xyz.quxiao.playwith.spring.aop.cglib;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 作者 :quxiao 创建时间：2019/10/17 15:06
 */
@Aspect
public class BeforeInvokeAdvice {

  private static final Logger logger = LoggerFactory.getLogger(BeforeInvokeAdvice.class);

  @Before("within(xyz.quxiao.playwith.spring.aop.cglib.Student) && execution(public void say(..)) && args(word))")
  public void recordWord(String word) {
    logger.info("invoking with:{}", word);
  }
}
