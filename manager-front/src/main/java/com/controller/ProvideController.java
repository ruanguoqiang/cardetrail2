package com.controller;

import com.common.model.DataTablesResult;
import com.common.pojo.Provider;
import com.qiangge.interf.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/provide")
public class ProvideController {

   @Autowired
   ProvideService provideService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "provide";
    }

    @RequestMapping(value = "getProvide",method = RequestMethod.GET)
    @ResponseBody
    public DataTablesResult getProvide(@RequestParam String Pno){
         Provider provider=provideService.getProvide(Pno);
         List<Provider> providers=new ArrayList<>();
         DataTablesResult result=new DataTablesResult();
         providers.add(provider);
         result.setData(providers);
         return result;
    }

    @RequestMapping(value = "getProvideList",method = RequestMethod.GET)
    @ResponseBody
    public  DataTablesResult getProvideList(int draw,int start,int length,String searchKey,@RequestParam("search[value]") String search,
                                            @RequestParam("order[0][column]") int orderCol,
                                            @RequestParam("order[0][dir]") String orderDir){
        try {
            search=new String(search.getBytes("ISO-8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String[] cols = {"checkbox","pno", "pname","padddr", "ptel"};
        String orderColumn = cols[orderCol];
        if (orderColumn==null){
            orderColumn="pname";
        }
        //获取排序方式 默认为desc(asc)
        if(orderDir == null) {
            orderDir = "desc";
        }
        if(!search.isEmpty()){
            searchKey=search;
        }
        DataTablesResult result=provideService.getRemoveMemberList(draw,start,length,searchKey,orderColumn,orderDir);
        return result;
    }
}
