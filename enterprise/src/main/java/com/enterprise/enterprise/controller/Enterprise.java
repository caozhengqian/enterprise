package com.enterprise.enterprise.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.enterprise.enterprise.utils.ReadUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Enterprise {

    @RequestMapping("/login")
    public JSONObject  login(){
        String path = Enterprise.class.getClassLoader().getResource("enterprise.json").getPath();
        String s = ReadUtils.readJsonFile(path);
        JSONObject jobj = JSON.parseObject(s);
        return (JSONObject)jobj.get("login");
    }
}
