package xyz.quxiao.playwith.spring.bean;

import lombok.Data;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:05
 */
@Data
public class Fruit {
  private String name;

  public Fruit(String name) {
    this.name = name;
  }
}
