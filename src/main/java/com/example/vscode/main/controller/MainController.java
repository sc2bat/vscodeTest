package com.example.vscode.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    
    @GetMapping(value="/")
    public String main() {
        return "content/main/main";
    }
    
}
