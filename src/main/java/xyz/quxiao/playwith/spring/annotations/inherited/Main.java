package xyz.quxiao.playwith.spring.annotations.inherited;

import com.alibaba.fastjson.JSON;
import java.lang.annotation.Annotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 结论：标注了@Inherited的注解可以被子类继承
 *
 * @author 作者 :quxiao 创建时间：2019/10/24 21:54
 */
public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Annotation[] declaredAnnotations = Dog.class.getDeclaredAnnotations();
    Annotation[] annotations = Dog.class.getAnnotations();
    logger.info("declaredAnnotations:{}", JSON.toJSONString(declaredAnnotations));
    logger.info("annotations:{}", JSON.toJSONString(annotations));
  }
}
