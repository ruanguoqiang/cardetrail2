package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "front")
public class ShowTreeController {

    @RequestMapping(value ="/tree" )
    public String getTree(){
        return "treestyle";
    }
}
