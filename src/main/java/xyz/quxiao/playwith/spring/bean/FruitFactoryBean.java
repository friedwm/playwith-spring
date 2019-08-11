package xyz.quxiao.playwith.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 作者 :quxiao 创建时间：2019/7/21 22:29
 */
public class FruitFactoryBean implements FactoryBean<Fruit> {

  private String fruitName;
  public FruitFactoryBean(String fruitName) {
    this.fruitName = fruitName;
  }

  @Override
  public Fruit getObject() throws Exception {

    return new Fruit(fruitName);
  }

  @Override
  public Class<?> getObjectType() {
    return Fruit.class;
  }
}
