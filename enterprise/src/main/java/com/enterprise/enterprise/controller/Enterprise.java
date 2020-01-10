package com.enterprise.enterprise.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.enterprise.enterprise.utils.ReadUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Enterprise {
    String path = Enterprise.class.getClassLoader().getResource("enterprise.json").getPath();
    String s = ReadUtils.readJsonFile(path);
    JSONObject jobj = JSON.parseObject(s);

    @RequestMapping("/login")
    public JSONObject  login(){
        return (JSONObject)jobj.get("login");
    }

   @RequestMapping("/getAllClaim")
   @CrossOrigin(origins = "*")
    public JSONObject  getAllClaim(){
        return (JSONObject)jobj.get("getAllClaim");
    }

    @RequestMapping("/pageQueryInsuredInfo")
    @CrossOrigin(origins = "*")
    public JSONObject  pageQueryInsuredInfo(){
        return (JSONObject)jobj.get("pageQueryInsuredInfo");
    }

    @RequestMapping("/getInsuredDetail")
    @CrossOrigin(origins = "*")
    public JSONObject  getInsuredDetail(){
        return (JSONObject)jobj.get("getInsuredDetail");
    }

    @RequestMapping("/pageQueryBenefitInfo")
    @CrossOrigin(origins = "*")
    public JSONObject  pageQueryBenefitInfo(){
        return (JSONObject)jobj.get("pageQueryBenefitInfo");
    }

    @RequestMapping("/getInsuredBenefit")
    @CrossOrigin(origins = "*")
    public JSONObject  getInsuredBenefit(){
        return (JSONObject)jobj.get("getInsuredBenefit");
    }
}
