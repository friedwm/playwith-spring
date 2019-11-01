package xyz.quxiao.playwith.spring.proxy.proxyfactory;

import com.alibaba.fastjson.JSON;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 作者 :quxiao 创建时间：2019/11/1 15:52
 */
public class AroundInterceptor implements MethodInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(AroundInterceptor.class);

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    logger.info("do something before Invoking");
    Object proceed = invocation.proceed();
    logger.info("got return:{}", JSON.toJSONString(proceed));
    return proceed;
  }
}
