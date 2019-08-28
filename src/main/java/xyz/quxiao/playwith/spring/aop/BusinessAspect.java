package xyz.quxiao.playwith.spring.aop;

/**
 * @author 作者 :quxiao 创建时间：2019/8/28 22:14
 */
public class BusinessAspect {

  public void doBefore() {
    System.out.println("before business");
  }

  public void doAfter() {
    System.out.println("after business");
  }
}
