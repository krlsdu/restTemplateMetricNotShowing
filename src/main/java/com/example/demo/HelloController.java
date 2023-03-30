package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  @GetMapping("/greetings")
  public String index(@Autowired RestTemplate restTemplate) {

    System.out.println(restTemplate.getForObject("http://google.com.br", String.class));
    return "Greetings from Spring Boot!";
  }

}
