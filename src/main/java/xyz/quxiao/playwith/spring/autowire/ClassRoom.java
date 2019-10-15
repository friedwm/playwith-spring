package xyz.quxiao.playwith.spring.autowire;

import lombok.Data;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 作者 :quxiao 创建时间：2019/10/15 22:06
 */
@Data
public class ClassRoom {
  @Autowired
  private Student student;


}
