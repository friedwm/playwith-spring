package xyz.quxiao.playwith.spring.proxy;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 作者 :quxiao 创建时间：2019/8/25 10:33
 */
public class RandomDice implements Dice {

  private static final Logger logger = LoggerFactory.getLogger(RandomDice.class);
  private static AtomicInteger globalIdx = new AtomicInteger(0);
  private int idx;
  private Random random = new Random(System.currentTimeMillis());

  public RandomDice() {
    logger.info("preInit, globalIdx:{}", globalIdx.get());
    idx = globalIdx.addAndGet(1);
  }

  @Override
  public int dice() {
    int result = 1 + random.nextInt(6);
    logger.info("dice, idx:{}, result:{}", idx, result);
    return result;
  }
}
