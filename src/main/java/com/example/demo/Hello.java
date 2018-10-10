package com.example.demo;
import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {


    @RequestMapping("/hello")
    public String hello(){
        System.out.print("test");
        return "hello spring boot";
    }
}
