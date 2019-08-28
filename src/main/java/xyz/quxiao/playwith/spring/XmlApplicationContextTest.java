package xyz.quxiao.playwith.spring;

import java.io.IOException;
import java.util.stream.LongStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.quxiao.playwith.spring.aop.BusinessService;
import xyz.quxiao.playwith.spring.proxy.Dice;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:06
 */
@Slf4j
public class XmlApplicationContextTest {

  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
        "ApplicationContext.xml");
    BusinessService service = ac.getBean(BusinessService.class);
    service.doBusiness();
    ac.close();
  }


}
