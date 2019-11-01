package xyz.quxiao.playwith.spring.proxy.proxyfactory;

import java.lang.reflect.Method;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author 作者 :quxiao 创建时间：2019/11/1 11:32
 */
public class BeforeDiceAdvice implements MethodBeforeAdvice {

  private static final Logger logger = LoggerFactory.getLogger(BeforeDiceAdvice.class);

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    logger.info("BeforeDiceAdvice");
  }
}
