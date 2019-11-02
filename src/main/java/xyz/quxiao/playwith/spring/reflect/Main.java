package xyz.quxiao.playwith.spring.reflect;

import java.lang.reflect.Proxy;

/**
 * @author 作者 :quxiao 创建时间：2019/10/31 22:28
 */
public class Main {

  public static void main(String[] args) {
    WorkService workService = (WorkService) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{WorkService.class},
        new WorkServiceInterceptor());

    workService.work("a bad job");
  }
}
