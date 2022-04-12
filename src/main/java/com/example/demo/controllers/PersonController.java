package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class PersonController {

    @GetMapping("/dashboard")
    public String dashboard(){

        return "/account/index";
    }
    @GetMapping("/activity")
    public String activity(){

        return "/account/activity";
    }

    @GetMapping("/edit")
    public String edit(){

        return "/account/edit";
    }

}
