package xyz.quxiao.playwith.spring.proxy;

import java.util.Random;

/**
 * @author 作者 :quxiao 创建时间：2019/8/25 10:33
 */
public class RandomDice implements Dice {

  private Random random = new Random(System.currentTimeMillis());

  @Override
  public int dice() {
    return 1 + random.nextInt(6);
  }
}
