package org.example.art_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController {
    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
