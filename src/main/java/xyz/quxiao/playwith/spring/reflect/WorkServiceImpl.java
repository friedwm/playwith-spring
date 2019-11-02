package xyz.quxiao.playwith.spring.reflect;

/**
 * @author 作者 :quxiao 创建时间：2019/10/31 22:38
 */
public class WorkServiceImpl implements WorkService {

  @Override
  public void work(String something) {
    System.out.println("hello , I am doing :" + something);
  }
}
