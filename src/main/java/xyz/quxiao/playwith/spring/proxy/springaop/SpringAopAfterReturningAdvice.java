package xyz.quxiao.playwith.spring.proxy.springaop;

import com.alibaba.fastjson.JSON;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 作者 :quxiao 创建时间：2019/8/25 10:35
 */
public class SpringAopAfterReturningAdvice implements AfterReturningAdvice {

  private static final Logger logger = LoggerFactory.getLogger(SpringAopAfterReturningAdvice.class);
  private ConcurrentHashMap<Integer, Integer> countMap = new ConcurrentHashMap<>();

  @Scheduled(cron = "0/5 * * * * ?")
  public void print() {
    logger.info("current:{}", JSON.toJSONString(countMap));
  }

  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
      throws Throwable {
    Integer value = null;
    try {
      value = (Integer) returnValue;
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (value != null) {
      countMap.compute(value, (k, o) -> {
        if (o == null) {
          return 1;
        } else {
          return o + 1;
        }
      });
    }
  }
}
