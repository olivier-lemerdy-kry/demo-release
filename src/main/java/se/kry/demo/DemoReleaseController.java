package se.kry.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoReleaseController {

  @GetMapping("/hello")
  public String helloWorld() {
    return "Hello World!";
  }
}
