package xyz.quxiao.playwith.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 作者 :quxiao 创建时间：2019/11/16 14:33
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    return "hello";
  }
}
