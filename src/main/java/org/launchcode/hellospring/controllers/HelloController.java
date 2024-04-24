package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping
    @ResponseBody
    public String helloDefault(){
        return "Hello, Spring!";
    }
    @GetMapping("hello") //route path, blank will target the default bath(8080)
    @ResponseBody
    public String helloRoute(){
        return "Hello, Spring!";
    }

    @GetMapping("goodbye") //route path, blank will target the default bath(8080)
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }
}
