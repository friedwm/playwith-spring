package xyz.quxiao.playwith.spring.aop.cglib;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 作者 :quxiao 创建时间：2019/10/15 22:07
 */
@Data
public class Student {

  private static final Logger logger = LoggerFactory.getLogger(Student.class);
  private String name = "quxiao";

  public Student() {
    logger.info("calling student ctor, name:{}", name);
  }

  public void say(String something) {
    logger.info("{} say:{}", name, something);
  }
}
