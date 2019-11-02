package xyz.quxiao.playwith.spring.reflect;

import com.alibaba.fastjson.JSON;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 作者 :quxiao 创建时间：2019/10/31 22:25
 */
public class WorkServiceInterceptor implements InvocationHandler {

  WorkServiceImpl workService = new WorkServiceImpl();

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Method workMethod = WorkService.class.getMethod("work", String.class);

    method.invoke(workService, "a good job");
    workMethod.invoke(workService, "a good job");

    return null;
  }
}
