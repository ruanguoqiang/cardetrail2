package com.genaratexml;

import com.common.pojo.StockIn;
import com.common.pojo.StockInExample;
import com.common.pojo.StockInKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockInMapper {
    int countByExample(StockInExample example);

    int deleteByExample(StockInExample example);

    int deleteByPrimaryKey(StockInKey key);

    int insert(StockIn record);

    int insertSelective(StockIn record);

    List<StockIn> selectByExampleWithBLOBs(StockInExample example);

    List<StockIn> selectByExample(StockInExample example);

    StockIn selectByPrimaryKey(StockInKey key);

    int updateByExampleSelective(@Param("record") StockIn record, @Param("example") StockInExample example);

    int updateByExampleWithBLOBs(@Param("record") StockIn record, @Param("example") StockInExample example);

    int updateByExample(@Param("record") StockIn record, @Param("example") StockInExample example);

    int updateByPrimaryKeySelective(StockIn record);

    int updateByPrimaryKeyWithBLOBs(StockIn record);

    int updateByPrimaryKey(StockIn record);
}