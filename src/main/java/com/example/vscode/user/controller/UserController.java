package com.example.vscode.user.controller;

import java.util.HashMap;

import org.apache.tomcat.util.net.openssl.ciphers.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.vscode.user.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;


@RequestMapping("/user")
@Controller
public class UserController {

    private PasswordEncoder passwordEncoder;

    @Autowired
    UserService userService;

    private HashMap<String, Object> resultMap = new HashMap<String, Object>();
    @GetMapping("/login")
    public String loginForm(){
        return "content/user/login/form";
    }

    @PostMapping(value="login")
    public HashMap<String, Object> login(@RequestParam HashMap<String, Object> paramMap) {
        String plainpassword = (String)paramMap.get("userPwd");
        paramMap.remove("userPwd");
        paramMap.put("userPwd", passwordEncoder.encode(plainpassword));
        resultMap.put("result", userService.login(paramMap));
        return resultMap;
    }
    
}
