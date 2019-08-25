package xyz.quxiao.playwith.spring.cglibs;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author 作者 :quxiao 创建时间：2019/8/22 22:34
 */
public class DaoProxyTest {

  @Test
  public void testCglib() {
    DaoProxy daoProxy = new DaoProxy();

    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(Dao.class);
    enhancer.setCallback(daoProxy);

    Dao dao = (Dao) enhancer.create();
    dao.update();
    dao.select();
  }
}