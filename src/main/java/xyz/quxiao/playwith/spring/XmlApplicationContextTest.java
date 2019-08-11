package xyz.quxiao.playwith.spring;

import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.quxiao.playwith.spring.bean.Fruit;
import xyz.quxiao.playwith.spring.service.FruitService;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:06
 */
@Slf4j
public class XmlApplicationContextTest {

  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
        "ApplicationContext.xml");

    Fruit fruit = ac.getBean("fruit", Fruit.class);
    FruitService fruitService = ac.getBean(FruitService.class);
    fruitService.printFruitName(fruit);
    log.info("hello");
    ac.close();
  }


}
