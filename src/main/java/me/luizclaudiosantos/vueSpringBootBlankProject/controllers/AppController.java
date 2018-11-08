package me.luizclaudiosantos.vueSpringBootBlankProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}