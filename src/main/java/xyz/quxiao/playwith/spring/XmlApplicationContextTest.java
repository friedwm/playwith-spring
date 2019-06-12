package xyz.quxiao.playwith.spring;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

/**
 * @author 作者 :quxiao 创建时间：2019/6/11 20:06
 */
@Slf4j
public class XmlApplicationContextTest {

  public static void main(String[] args) throws IOException {
    Resource classPathResource = new DefaultResourceLoader()
        .getResource("classpath*:META-INF/MANIFEST.MF");
    Scanner scanner = new Scanner(new BufferedInputStream(classPathResource.getInputStream()));
    while (scanner.hasNextLine()) {
      log.info("{}", scanner.nextLine());
    }

  }
}
