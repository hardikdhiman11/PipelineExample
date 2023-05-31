package com.example.Pipeline.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class controller {

    @GetMapping("/world")
    public String get()
    {
        return "Hello World";
    }

}
