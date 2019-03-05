package com.qiangge.interf;

import com.common.model.DataTablesResult;
import com.common.pojo.Provider;

public interface ProvideService {
   /*
    * 获取供应商
   */
    public Provider getProvide(String Pno);


    DataTablesResult getRemoveMemberList(int draw, int start, int length, String searchKey, String orderColumn, String orderDir);

    public Boolean updateProvide(Provider provider);

    public Boolean deleteProvide(String Pid);

    public void insertProvide(Provider provider);

    public Boolean getProvideByname(String pname);
}
