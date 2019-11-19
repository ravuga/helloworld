package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @RequestMapping("/")
        public String index() {
            return "halo from Gaurav Kumar !";
        }
}
