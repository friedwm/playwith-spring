package xyz.quxiao.playwith.spring.meta;

import java.lang.annotation.Annotation;
import org.springframework.core.type.StandardAnnotationMetadata;

/**
 * @author 作者 :quxiao 创建时间：2019/10/24 17:03
 */
public class AnnotationMetaMain {

  public static void main(String[] args) {
    StandardAnnotationMetadata meta = new StandardAnnotationMetadata(
        EatService.class);

    System.out.println(meta.isAnnotated("org.springframework.stereotype.Component"));
    System.out.println(meta.getAnnotationAttributes("org.springframework.stereotype.Service"));
  }
}
