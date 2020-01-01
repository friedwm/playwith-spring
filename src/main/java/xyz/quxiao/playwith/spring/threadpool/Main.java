package xyz.quxiao.playwith.spring.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 作者 :quxiao 创建时间：2020/1/2 0:10
 */
public class Main {

  public static void main(String[] args) throws InterruptedException {
    ThreadPoolExecutor exec = new ThreadPoolExecutor(2, 2, 10, TimeUnit.DAYS,
        new LinkedBlockingQueue<>());

    exec.execute(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().toString() + "开始准备工作");
        try {
          TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().toString() + "工作完毕");
      }
    });

    TimeUnit.MINUTES.sleep(2);
    System.out.println("主线程又提交了一个任务");
    exec.execute(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().toString() + "开始准备工作");
        try {
          TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().toString() + "工作完毕");
      }
    });
    TimeUnit.MINUTES.sleep(2);
    System.out.println("主线程完成，准备退出");
    exec.shutdown();
    System.exit(0);
  }
}
