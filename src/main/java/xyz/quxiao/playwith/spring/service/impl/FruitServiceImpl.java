package xyz.quxiao.playwith.spring.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import xyz.quxiao.playwith.spring.bean.Fruit;
import xyz.quxiao.playwith.spring.service.FruitService;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:07
 */
@Service
public class FruitServiceImpl implements FruitService {

  private static final Logger logger = LoggerFactory.getLogger(FruitServiceImpl.class);

  @Override
  public String printFruitName(Fruit fruit) {

    return null;
  }
}
