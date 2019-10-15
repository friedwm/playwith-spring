package xyz.quxiao.playwith.spring.autowire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 作者 :quxiao 创建时间：2019/10/15 22:07
 */
@Data
@Component
@NoArgsConstructor
public class Student {
  private String name = "quxiao";
}
