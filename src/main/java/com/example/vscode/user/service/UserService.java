package com.example.vscode.user.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vscode.user.dao.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Boolean login(HashMap<String, Object> paramMap) {
        return userMapper.register(paramMap);
    }
    
    
}
