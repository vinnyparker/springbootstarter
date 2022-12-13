package br.com.springbootstarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author vinny
 * Started at 12/12/2022
 **/

@Controller
public class PageController {
    @GetMapping("/")
    public String index(){
        return "login";
    }

    @GetMapping("/forgotpassword")
    public String forgotPasswd(){
        return "forgot-password";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
