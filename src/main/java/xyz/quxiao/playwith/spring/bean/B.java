package xyz.quxiao.playwith.spring.bean;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 作者 :quxiao 创建时间：2019/9/29 11:36
 */
@Data
public class B {

  private static final Logger logger = LoggerFactory.getLogger(B.class);
  @Autowired
  private A a;

  public B() {
    logger.info("invoking B ctor");
  }

  public void test() {
    System.out.println("Test from B");
  }
}
