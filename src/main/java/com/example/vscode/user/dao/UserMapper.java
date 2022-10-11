package com.example.vscode.user.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Boolean register(HashMap<String, Object> paramMap);



}
