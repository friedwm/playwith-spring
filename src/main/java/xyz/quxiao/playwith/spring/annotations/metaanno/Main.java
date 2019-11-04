package xyz.quxiao.playwith.spring.annotations.metaanno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.type.StandardAnnotationMetadata;

/**
 * 结论工具类不会搜索父类
 *
 * @author 作者 :quxiao 创建时间：2019/11/4 21:21
 */
public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    StandardAnnotationMetadata metadata = new StandardAnnotationMetadata(PlayGround.class);
    logger.info("annotated @Component:{}",
        metadata.isAnnotated("org.springframework.stereotype.Component"));
    logger.info("annotated @CompAnno:{}",
        metadata.isAnnotated("xyz.quxiao.playwith.spring.annotations.metaanno.CustomAnno"));
  }
}
