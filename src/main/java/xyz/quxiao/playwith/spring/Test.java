package xyz.quxiao.playwith.spring;

/**
 * @author 作者 :quxiao 创建时间：2019/7/23 22:14
 */
public class Test {

  public static class A {}
  public static class B extends A {}
  public static class C extends B {}

  public static void main(String[] args) {
    C[] cArr = new C[10];
    B[] bArr = cArr;
    bArr[0] = new B();

    System.out.println("good job");
  }
}
