package com.full_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String goHome(){
        return "main_templ";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }

}
