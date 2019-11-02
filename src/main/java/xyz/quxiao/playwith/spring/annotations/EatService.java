package xyz.quxiao.playwith.spring.annotations;

import java.lang.annotation.Annotation;
import org.springframework.stereotype.Service;

/**
 * @author 作者 :quxiao 创建时间：2019/10/24 21:54
 */
@Service
public class EatService {

  public static void main(String[] args) {
    Annotation[] annotations = EatService.class.getAnnotations();

  }
}
