package xyz.quxiao.playwith.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author 作者 :quxiao 创建时间：2019/9/11 23:29
 */
@Data
@Component
public class Student {
  private String name;
  private int age;
}
