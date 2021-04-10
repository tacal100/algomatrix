package com.tc.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController{

    @GetMapping("/")
    public String start(Model model){
        return "main";
    }
}