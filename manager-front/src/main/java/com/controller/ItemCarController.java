
package com.controller;

import com.common.model.ZTreeNode;
import com.qiangge.interf.ItemCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "itemcar")
public class ItemCarController {

    @Autowired
    ItemCarService itemCarService;
    @RequestMapping(value = "/getTree",method = RequestMethod.GET)
    @ResponseBody
    public List getItemTree(@RequestParam(name="id",required = false,defaultValue = "0") int parentId){
        java.util.List<ZTreeNode> zTreeNodeList=itemCarService.getItemcar(Long.valueOf(parentId));
        return zTreeNodeList;
    }
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}

