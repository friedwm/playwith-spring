package xyz.quxiao.playwith.spring.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 作者 :quxiao 创建时间：2019/11/4 12:52
 */
public class Gambler {
  private static final Logger logger = LoggerFactory.getLogger(Gambler.class);
  @Autowired
  private Dice dice;

  public void rollDice() {
    logger.info("dice:{}, result:{}", dice.getIdx(), dice.dice());
  }
}
