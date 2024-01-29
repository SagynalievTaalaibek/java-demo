package org.example.art_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "<h1>Hello world</h1> <p>Taalaibek</p>";
    }

}
