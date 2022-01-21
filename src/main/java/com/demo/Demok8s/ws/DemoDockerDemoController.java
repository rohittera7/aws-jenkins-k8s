package com.demo.Demok8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World - Demo - aampe";
    }
}
