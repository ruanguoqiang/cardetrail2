package com.controller;

import com.config.Playutil;
import com.qiangge.interf.AuthenticationRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "admin")
public class TestSsoController {
    @Autowired
    AuthenticationRpcService authenticationRpcService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/simple",method = RequestMethod.GET)
    public String logout(){
        return "index3";
    }

    @RequestMapping(value = "/app",method = RequestMethod.GET)
    public String app(){
        authenticationRpcService.updatePermission("sso-server");
        return "loginout";
    }

    @RequestMapping(value = "/player")
    @ResponseBody
    public String mediaPlayer(@RequestParam String file){
        String msg= Playutil.openExe(file);
        if (msg=="error"){
            String data="9999";
            return data;
        }
        else {
            String data="0000";
            return data;
        }

    }

}
