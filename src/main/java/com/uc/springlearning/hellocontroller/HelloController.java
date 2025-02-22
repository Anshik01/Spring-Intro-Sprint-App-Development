package com.uc.springlearning.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value = {"", "/"})
    @ResponseBody
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
