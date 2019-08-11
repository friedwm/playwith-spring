package xyz.quxiao.playwith.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:05
 */
@Data
public class Fruit implements InitializingBean {

  private String name;

  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Fruit in lifecycle hooking");
  }
}
