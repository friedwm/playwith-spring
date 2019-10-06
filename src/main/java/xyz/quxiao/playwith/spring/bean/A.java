package xyz.quxiao.playwith.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author 作者 :quxiao 创建时间：2019/9/29 11:36
 */
@Data
public class A {

  @Autowired
  private B b;

  private int value = 2;

  public static void main(String[] args) {
    A a = new A();
  }

  public A() {
    System.out.println("value="+value);
  }

  public void test() {
    System.out.print("calling from A:");
    b.test();

  }
}
