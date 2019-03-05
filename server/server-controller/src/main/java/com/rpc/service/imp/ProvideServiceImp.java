package com.rpc.service.imp;

import com.common.model.DataTablesResult;
import com.common.pojo.Provider;
import com.common.pojo.ProviderExample;
import com.genaratexml.ProviderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qiangge.interf.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvideServiceImp implements ProvideService {

    @Autowired
    ProviderMapper providerMapper;

    @Override
    public Provider getProvide(String Pno) {
        return providerMapper.selectByPrimaryKey(Pno);
    }

    @Override
    public DataTablesResult getRemoveMemberList(int draw, int start, int length, String searchKey, String orderColumn, String orderDir) {
       DataTablesResult result=new DataTablesResult();
       try {
           PageHelper.startPage(start/length+1,length);
           List<Provider> providerList=providerMapper.selectBySerch("%"+searchKey+"%",orderColumn,orderDir);
           PageInfo<Provider> pageInfo=new PageInfo<>(providerList);
           result.setRecordsFiltered((int)pageInfo.getTotal());
           result.setRecordsTotal((int)pageInfo.getTotal());

           result.setDraw(draw);
           result.setData(providerList);

       }finally {

       }

        return result;
    }

    @Override
    public Boolean updateProvide(Provider provider) {
        providerMapper.updateByPrimaryKey(provider);
        return true;
    }

    @Override
    public Boolean deleteProvide(String Pid) {
        providerMapper.deleteByPrimaryKey(Pid);
        return true;
    }

    @Override
    public void insertProvide(Provider provider) {
        providerMapper.insert(provider);
    }

    @Override
    public Boolean getProvideByname(String pname) {
        ProviderExample providerExample=new ProviderExample();
        ProviderExample.Criteria criteria= providerExample.createCriteria();
        criteria.andPnameEqualTo(pname);
        List<Provider> providers= providerMapper.selectByExample(providerExample);
        if (providers.size()>0){
            return true;
        }
        return  false;
    }
}
