package xyz.quxiao.playwith.spring;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import javax.annotation.Nullable;

/**
 * @author 作者 :quxiao 创建时间：2019/8/14 22:47
 */
public class TestReflection {

  public Integer integer;
  private int i;
  @Nullable
  private String desc;

  public static void main(String[] args) {
    System.out.println(int.class.isAssignableFrom(Integer.class));
    System.out.println(Integer.class.isAssignableFrom(int.class));
    System.out.println(Integer.TYPE.isAssignableFrom(int.class));
  }
}
