package xyz.quxiao.playwith.spring.proxy.proxyfactory;

import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

/**
 * @author 作者 :quxiao 创建时间：2019/11/1 11:34
 */
public class AfterDicingAdvice implements AfterReturningAdvice {

  private static final Logger logger = LoggerFactory.getLogger(AfterDicingAdvice.class);

  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
      throws Throwable {
    logger.info("invoking AfterDicingAdvice:{}", returnValue);
  }
}
