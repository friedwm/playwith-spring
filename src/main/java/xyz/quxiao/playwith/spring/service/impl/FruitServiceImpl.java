package xyz.quxiao.playwith.spring.service.impl;

import org.springframework.stereotype.Service;
import xyz.quxiao.playwith.spring.bean.Fruit;
import xyz.quxiao.playwith.spring.service.FruitService;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:07
 */
@Service
public class FruitServiceImpl implements FruitService {

  @Override
  public void printFruitName(Fruit fruit) {
    System.out.println(fruit.getName());
  }
}
