package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greeting {
    @GetMapping("/hello")
    String HelloWorld(){
        return "greeting";
    }
}
