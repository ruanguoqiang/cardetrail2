package com.controller;

import com.common.model.DataTablesResult;
import com.common.model.Result;
import com.common.pojo.Provider;
import com.qiangge.interf.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
         result.setSuccess(true);
         return result;
    }

    @RequestMapping(value = "editPage",method = RequestMethod.GET)
    public String getEditPage(){
        return "provide-edit";
    }

    @RequestMapping(value = "provideAdd",method = RequestMethod.GET)
    public String getAddPage(){
        return "provide-add";
    }

    @RequestMapping(value = "updateProvide",method = RequestMethod.POST)
    @ResponseBody
    public Result updateProvide(@RequestBody Provider provider){
        provideService.updateProvide(provider);
        Result result= Result.createSuccessResult(null,"success");
        return result ;
    }

    @RequestMapping(value = "deleteProvide",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteProvide(@RequestParam String Pno){
        provideService.deleteProvide(Pno);
        Result result= Result.createSuccessResult(null,"success");
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

    @RequestMapping(value = "deleteProvideList/{pids}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteProvideList(@PathVariable String[] pids){

       for (String pid:pids){
           provideService.deleteProvide(pid);
       }
       Result result=Result.createSuccessResult(null,"success");
       return result;
    }
    @RequestMapping(value = "insertProvide",method = RequestMethod.POST)
    @ResponseBody
    public Result insertProvide(@RequestBody Provider provider){
        provideService.insertProvide(provider);
        Result result=Result.createSuccessResult(null,"success");
        return result;
    }

    @RequestMapping(value = "pname",method = RequestMethod.GET)
    public boolean roleName( String pname){

        if(provideService.getProvideByname(pname)){
            return true;
        }
        return false;
    }
}
