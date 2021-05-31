package com.vidhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "main-menu";
    }


    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
